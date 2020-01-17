package com.yash.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import com.yash.pojos.Employee;

public class EmployeeDaoImpl implements EmployeeDao {

	//@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public EmployeeDaoImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public List<Employee> getAllEmp(){  
		 return jdbcTemplate.query("select * from employee",new ResultSetExtractor<List<Employee>>(){  
		    @Override  
		     public List<Employee> extractData(ResultSet rs) throws SQLException,  
		            DataAccessException {  

		        List<Employee> list=new ArrayList<Employee>();  
		        while(rs.next()){  
		        Employee e=new Employee();  
		        e.setId(rs.getInt(1));  
		        e.setName(rs.getString(2));  
		        e.setSalary(rs.getInt(3));  
		        list.add(e);  
		        }  
		        return list;  
		        }  
		    });  
		  }

	@Override
	public Employee getEmpById(int id) {
		String query="select * from employee where id='"+id+"'";
		return jdbcTemplate.query(query, new ResultSetExtractor<Employee>() {
			Employee e=new Employee();
			@Override
			public Employee extractData(ResultSet rst) throws SQLException, DataAccessException {
				// TODO Auto-generated method stub
				if(rst.next())
				{
					e.setId(rst.getInt(1));
					e.setName(rst.getString(2));
					e.setSalary(rst.getDouble(3));
				}
					
				return e;
			}
			
			
		});
	}

	@Override
	public String deleteEmp(int id) {
		String query="delete from employee where id='"+id+"'";
		
		//jdbcTemplate.execute()
		int id1=jdbcTemplate.update(query);
		if(id1==1)
			return "deleted with id "+id;
		return "failed";
	}

	@Override
	public String updateEmp(int id, Employee emp) {
		String name=emp.getName();
		double salary=emp.getSalary();
		String query="update employee set name = '"+name+"'"+" , salary = "+salary+" where id = '"+id+"' ";
		int id1=jdbcTemplate.update(query);
		if(id1==1)
			return "updated with id "+id;
		return "failed";
	}

	@Override
	public String insertEmp(Employee emp) {
		String query="insert into employee values("+emp.getId()+",'"+emp.getName()+"'"+","+emp.getSalary()+")";
		int id1=jdbcTemplate.update(query);
		if(id1==1)
			return "inserted with id "+emp.getId();
		return "dublicate id";
	}

	
}
