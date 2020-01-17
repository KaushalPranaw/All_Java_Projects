package com.yash.pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.lang.NonNull;
 

@Entity
@Table(name="employee")
public class Employee {

	private int employeeId;
	private String employeeName;
	private String employeeTask;
	private String assignedBy;
	private String status;

	public Employee(int employeeId, String employeeName, String employeeTask, String assignedBy, String status) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeTask = employeeTask;
		this.assignedBy = assignedBy;
		this.status = status;
	}

	public Employee() {
		System.out.println("in const of "+getClass().getName());
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeTask="
				+ employeeTask + ", assignedBy=" + assignedBy + ", status=" + status + "]";
	}

	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	@Size(min=5, max=50)
	@NotEmpty
    @Column(name = "name", nullable = false)
	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	@Size(min=5, max=50)
	@Column(name="task")
	@NotEmpty
	public String getEmployeeTask() {
		return employeeTask;
	}

	public void setEmployeeTask(String employeeTask) {
		this.employeeTask = employeeTask;
	}

	@Size(min=5, max=50)
	@Column
	@NotEmpty
	public String getAssignedBy() {
		return assignedBy;
	}

	public void setAssignedBy(String assignedBy) {
		this.assignedBy = assignedBy;
	}

	@Column
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
