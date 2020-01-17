package pojos;

import java.util.Date;
import java.util.Arrays;

import javax.persistence.*;

@Entity
@Table(name="customer")
public class Customer {

	private Integer id;
	private String name,email,password,role;
	private double regAmount;
	private Date date;
	private byte[] photo;
	private CustomerType custType;
	public Customer() {
		super();
		System.out.println("in cust");
	}
	public Customer(Integer id, String name, String email, String password, String role, double regAmount, Date date,
			CustomerType custType) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
		this.role = role;
		this.regAmount = regAmount;
		this.date = date;
		//this.photo = photo;
		this.custType = custType;
	}
	public Customer(String name, String email, String password, String role, double regAmount, Date date,  
			CustomerType custType) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
		this.role = role;
		this.regAmount = regAmount;
		this.date = date;
		//this.photo = photo;
		this.custType = custType;
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	@Column(name="name",length=20)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Column(name="email",unique=true)
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Column(name="password",length=20)
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Column(name="role",length=20)
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	@Column(name="regAmount",columnDefinition="double(8,2)")
	public double getRegAmount() {
		return regAmount;
	}
	public void setRegAmount(double regAmount) {
		this.regAmount = regAmount;
	}
	
	@Temporal(TemporalType.DATE)
	@Column(name="date",length=20)
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	@Lob
	public byte[] getPhoto() {
		return photo;
	}
	public void setPhoto(byte[] photo) {
		this.photo = photo;
	}
	
	@Enumerated(EnumType.STRING)
	public CustomerType getCustType() {
		return custType;
	}
	public void setCustType(CustomerType custType) {
		this.custType = custType;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", email=" + email + ", password=" + password + ", role="
				+ role + ", regAmount=" + regAmount + ", date=" + date + ", photo=" + Arrays.toString(photo)
				+ ", custType=" + custType + "]";
	}
	
	
	
	
}
