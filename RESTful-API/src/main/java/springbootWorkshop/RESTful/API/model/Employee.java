package springbootWorkshop.RESTful.API.model;

import java.util.Date;

public class Employee {
	private Long id;
	private String name;
	private String department;
	private Date jointDate;
	public Employee() {
		super();
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public Date getJointDate() {
		return jointDate;
	}
	public void setJointDate(Date jointDate) {
		this.jointDate = jointDate;
	}
	
	
}
