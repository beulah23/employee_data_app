package com.employee.app.empdata.entity;

import javax.persistence.*;
@Entity
@Table(name="Employee")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int empId;
	String name;
	String mobileNo;

	/*
	 * public Employee(int empId, String name, String mobileNo) { super();
	 * this.empId = empId; this.name = name; this.mobileNo = mobileNo; }
	 */
	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

}
