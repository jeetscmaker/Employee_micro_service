package com.jk;

public class Employee {
	private int Id;
	private String name;
	private String email;
	private String phone;
	
	public Employee(){}
	public Employee(int id, String employeeName, String emailId, String phoneNo){
		Id = id;
		name = employeeName;
		email = emailId;
		phone = phoneNo;
	}
	
	@Override
	public String toString() {
		return "Employee [Id=" + Id + ", name=" + name + ", email=" + email + ", phone=" + phone + "]";
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
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
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
}
