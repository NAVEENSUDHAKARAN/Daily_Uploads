package com.chainsys.servlet;

public class UserDetails {

	String Name, DOB, EmpId;

	public UserDetails(String name, String dOB, String empId) {
		Name = name;
		DOB = dOB;
		EmpId = empId;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getDOB() {
		return DOB;
	}

	public void setDOB(String dOB) {
		DOB = dOB;
	}

	public String getEmpId() {
		return EmpId;
	}

	public void setEmpId(String empId) {
		EmpId = empId;
	}

	
}
