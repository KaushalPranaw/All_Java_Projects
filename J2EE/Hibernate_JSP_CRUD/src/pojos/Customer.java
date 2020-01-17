package pojos;

import java.text.SimpleDateFormat;
import java.util.*;

import javax.persistence.*; 

@Entity
@Table(name="customer")
public class Customer {

	private Integer custId;
	private String name,email,password,role;
	private double amount;
	private Date date;
	public Customer() {
		System.out.println("in cust");
	}
	
	private static SimpleDateFormat sdf;
	static
	{
		sdf=new SimpleDateFormat("yyyy-MM-dd");
	}
	public Customer(Integer custId, String name, String email, String password, String role, double amount, Date date) {
		super();
		this.custId = custId;
		this.name = name;
		this.email = email;
		this.password = password;
		this.role = role;
		this.amount = amount;
		this.date = date;
	}
	public Customer(String name, String email, String password, String role, double amount, Date date) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
		this.role = role;
		this.amount = amount;
		this.date = date;
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getCustId() {
		return custId;
	}
	public void setCustId(Integer custId) {
		this.custId = custId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	@Temporal(TemporalType.DATE)
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", name=" + name + ", email=" + email + ", password=" + password
				+ ", role=" + role + ", amount=" + amount + ", date=" + date + "]";
	}
	
	
	
	
	
}
