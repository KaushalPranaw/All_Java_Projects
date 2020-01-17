package com.yash.pojos;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import org.hibernate.validator.constraints.NotBlank;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.lang.NonNull;

@Entity
@Table(name = "vendor")
public class Vendor {

	private int id;
	private String name;
	private double salary;
//	private Date jDate;

	public Vendor() {
		System.out.println("in const : "+getClass().getName());
	}

	 
	

	public Vendor(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@NonNull
	@Size(min=3,max=50)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	//@NotBlank
	@Column(columnDefinition="double(10,2)")
	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	/*@NonNull
	@Temporal(value = TemporalType.DATE)
	@DateTimeFormat(pattern="yyyy-MM-dd")
	//@Type(type="org.jadira.usertype.dateandtime.joda.PersistentLocalDate")
	public Date getjDate() {
		return jDate;
	}

	public void setjDate(Date jDate) {
		this.jDate = jDate;
	}
*/
	@Override
	public String toString() {
		return "Vendor [id=" + id + ", name=" + name + ", salary=" + salary +  "]";
	}

}
