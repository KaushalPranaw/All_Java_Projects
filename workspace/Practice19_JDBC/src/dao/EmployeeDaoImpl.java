package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import static utils.DBUtils.*;

import pojo.Employee;

public class EmployeeDaoImpl implements EmployeeDao {

	private Connection cn;
	private PreparedStatement pst1,pst2,pst3;
	
	public EmployeeDaoImpl() throws Exception {
		 cn=getConnection();
		 pst1=cn.prepareStatement("select * from emp where jdate>?");
		 pst2=cn.prepareStatement("insert into emp values(default,?,?,?,?)");
		 pst3=cn.prepareStatement("update emp set salary=salary+? where id=?");
	}
	
	public void cleanUp() throws Exception
	{
		if(pst1!=null)
			pst1.close();
		if(pst2!=null)
			pst2.close();
		if(pst3!=null)
			pst3.close();
		if(cn!=null)
			cn.close();
		System.out.println("dao cleaned up");
	}
	
	@Override
	public List<Employee> getEmpDetails(String joiningDate) throws Exception {
		// TODO Auto-generated method stub
		pst1.setDate(1, Date.valueOf(joiningDate));
		
		ArrayList<Employee> l1=new ArrayList<>();
		try(ResultSet rst=pst1.executeQuery())
		{
			while(rst.next())
			{
				l1.add(new Employee(rst.getInt(1), 
						rst.getString(2), 
						rst.getString(3), 
						Date.valueOf(joiningDate), 
						rst.getDouble(5)));
			}
		}
		//System.out.println(l1);
		return l1;
	}

	@Override
	public String hireEmp(Employee e) throws Exception {
		// TODO Auto-generated method stub
		pst2.setString(1, e.getName());
		pst2.setString(2, e.getAddress());
		pst2.setDate(3, e.getJdate());
		pst2.setDouble(4, e.getSalary());
		int n=pst2.executeUpdate();
		if(n==1)
				return "emp hired";
		return "Emp not hired";
	}

	@Override
	public String updateEmp(int id, double inc) throws Exception {
		// TODO Auto-generated method stub
		pst3.setDouble(1, inc);
		pst3.setInt(2, id);
		
		int n=pst3.executeUpdate();
		if(n==1)
			return "updated";
		return "Not updated";
	}
	
	
}
