package dao;

import static utils.DBUtils.getConnection;
import java.sql.*;

import pojo.Customer;

public class CustomerDaoImpl implements CustomerDao {

	private Connection con;
	private PreparedStatement pst1;
	
	public CustomerDaoImpl() throws Exception {
		// TODO Auto-generated constructor stub
		con=getConnection();
		pst1=con.prepareStatement("select * from mycustomer where email=? and password=?");
		System.out.println("in dao init");
	}
	
	 public void cleanUp() throws Exception
	 {
		 if(!con.isClosed())
			 con.close();
		 
		 if(!pst1.isClosed())
			 pst1.close();
	 }
	
	@Override
	public Customer validateCust(String em, String pass) throws Exception {

		pst1.setString(1, em);
		pst1.setString(2, pass);
		
		try(ResultSet rst=pst1.executeQuery()) {
			if(rst.next())
				return new Customer(rst.getInt(1), rst.getDouble(2), rst.getString(3), rst.getString(4), rst.getString(5), rst.getDate(6), rst.getString(7));
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		return new Customer();
	}
	
	

	
}
