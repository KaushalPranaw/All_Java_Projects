package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import static utils.DBUtils.*;
import pojos.Customer;

public class CustDaoImpl implements CustDao {

	private Connection cn;
	private PreparedStatement pst1,pst2;
	
	public CustDaoImpl() throws Exception {
		// TODO Auto-generated constructor stub
		cn=getConnection();
		pst1=cn.prepareStatement("select * from mycustomer where email=? and password=?");
		pst2=cn.prepareStatement("insert into mycustomer values(default,?,?,?,?,?,?)");
	}
	
	public void cleanUp() throws SQLException
	{
		if(pst1!=null)
			pst1.close();
		if(pst2!=null)
			pst2.close();
	}
	
	@Override
	public Customer validatUser(String em, String pass) throws Exception {
		// TODO Auto-generated method stub
		Customer c=null;
		pst1.setString(1, em);
		pst1.setString(2, pass);
		
		try(ResultSet r=pst1.executeQuery())
		{
			if(r.next())
				c= new Customer(r.getInt(1), r.getDouble(2), r.getString(3), r.getString(4), r.getString(5), r.getDate(6), r.getString(7));
		}
		
		return c;
	}

	@Override
	public String register(Customer c) throws Exception {
		  
		pst2.setDouble(1, c.getRegAmount());
		pst2.setString(2, c.getEmail());
		pst2.setString(3, c.getName());
		pst2.setString(4, c.getPassword());
		pst2.setDate(5, c.getRegDate());
		pst2.setString(6, c.getRole());
		 
		int id=pst2.executeUpdate();
		if(id==1)
			return "custer registed successfully";
		else
			return "registration failed";
	}

	@Override
	public Customer getAllCat() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	
	

	
}
