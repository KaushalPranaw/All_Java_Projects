package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import pojos.Employee;
import utils.DBUtils;

public class EmpDaoImpl implements EmployeeDao {

	private Connection con;
	private PreparedStatement pst1, pst2, pst3, pst4;
	private SimpleDateFormat sdf;

	public EmpDaoImpl() throws ClassNotFoundException, SQLException {
		System.out.println("in construtor of " + getClass().getName());
		con = DBUtils.getConnection();
		pst1 = con.prepareStatement("SELECT * FROM employee WHERE date = ?");
		pst2 = con.prepareStatement("insert into employee values(default,?,?,?)");
		pst3 = con.prepareStatement("update employee set salary=salary+? where id = ?");
		pst4 = con.prepareStatement("delete from employee where id = ?");
	}

	public void cleanUp() throws SQLException {
		if (con != null) {
			con.close();
		}
		if (pst1 != null) {
			pst1.close();
		}
		if (pst2 != null) {
			pst2.close();
		}
		if (pst3 != null) {
			pst3.close();
		}
		if (pst4 != null) {
			pst4.close();
		}
		System.out.println("dao cleaned up");
	}

	@Override
	public List<Employee> getEmployeeDetails(String joiningdate) throws Exception {
		pst1.setDate(1, Date.valueOf(joiningdate));
		ArrayList<Employee> empList = new ArrayList<>();
		try (ResultSet rst = pst1.executeQuery()) {
			while (rst.next()) {
				empList.add(new Employee(rst.getInt(1), rst.getString(2), rst.getDouble(3), rst.getDate(4)));
			}
		}
		return empList;
	}

	@Override
	public void addEmployee(Employee e) throws Exception {
		pst2.setString(1, e.getName());
		pst2.setDouble(2, e.getSalary());
		pst2.setDate(3, (Date) e.getJoining_date());
		int i = pst2.executeUpdate();
		System.out.println(i);
		if (i == 1) {
			System.out.println("emp inserted");
		} else {
			System.out.println("not inserted");
		}
	}

	@Override
	public void deleteEmployeeById(int id) throws Exception {
		pst4.setInt(1, id);
		int i = pst4.executeUpdate();
		if(i==1)
		{
			System.out.println("deleted ");
		}
		else
			System.out.println("Not deleted");

	}

	@Override
	public void updateEmployee(int id, int increment)throws Exception {
		pst3.setDouble(1, increment);
		pst3.setInt(2, id);
		int i = pst3.executeUpdate();
		if(i==1)
		{
			System.out.println("updated ");
		}
		else
			System.out.println("Not updated");

	}

}
