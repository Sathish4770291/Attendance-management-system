package com.example.cms.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "students")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
     private Long id;
	

	@Column(name = "Register_Number" , nullable = false  , unique = true)
    private String registerNumber;
	
	@Column(name = "first_name" , nullable = false)
     private String firstName;
	
	@Column(name = "last_name" , nullable = false)
     private String lastName;
	
	@Column(name = "dateOfBirth" , nullable = false)
    private String dob;
	
	@Column(name = "Gender" , nullable = false)
    private String gender;
	
	@Column(name = "BloodGrp", nullable = false )
	private String bloodGrp;
	
	@Column(name = "department" , nullable = false)
    private String department;
	
	@Column(name = "department_year" , nullable = false)
    private String departmentYear;
	
	@Column(name = "Mobile_Number" , nullable = false  , unique = true)
    private String mobileNumber;
	
	@Column(name = "Parent_Number"  , unique = true , nullable = false )
    private String parentNumber;
	
	@Column(name = "email" , nullable = false , unique = true, length = 45)
     private String email;
     
	@Column(name = "Address", nullable = false )
    private String address;
	
     public Student() {
    	 
     }
     

	

	



	public Student(String registerNumber, String firstName, String lastName, String dob, String gender, String bloodGrp,
			String department, String departmentYear, String mobileNumber, String parentNumber, String email,
			String address) {
		super();
		this.registerNumber = registerNumber;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = dob;
		this.gender = gender;
		this.bloodGrp = bloodGrp;
		this.department = department;
		this.departmentYear = departmentYear;
		this.mobileNumber = mobileNumber;
		this.parentNumber = parentNumber;
		this.email = email;
		this.address = address;
	}








	public Long getId() {
		return id;
	}




	public void setId(Long id) {
		this.id = id;
	}




	public String getRegisterNumber() {
		return registerNumber;
	}




	public void setRegisterNumber(String registerNumber) {
		this.registerNumber = registerNumber;
	}




	public String getFirstName() {
		return firstName;
	}




	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}




	public String getLastName() {
		return lastName;
	}




	public void setLastName(String lastName) {
		this.lastName = lastName;
	}




	public String getDob() {
		return dob;
	}




	public void setDob(String dob) {
		this.dob = dob;
	}




	public String getGender() {
		return gender;
	}




	public void setGender(String gender) {
		this.gender = gender;
	}




	public String getBloodGrp() {
		return bloodGrp;
	}




	public void setBloodGrp(String bloodGrp) {
		this.bloodGrp = bloodGrp;
	}




	public String getDepartment() {
		return department;
	}




	public void setDepartment(String department) {
		this.department = department;
	}




	public String getDepartmentYear() {
		return departmentYear;
	}




	public void setDepartmentYear(String departmentYear) {
		this.departmentYear = departmentYear;
	}




	public String getMobileNumber() {
		return mobileNumber;
	}




	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}




	public String getParentNumber() {
		return parentNumber;
	}




	public void setParentNumber(String parentNumber) {
		this.parentNumber = parentNumber;
	}




	public String getEmail() {
		return email;
	}




	public void setEmail(String email) {
		this.email = email;
	}




	public String getAddress() {
		return address;
	}




	public void setAddress(String address) {
		this.address = address;
	}




}