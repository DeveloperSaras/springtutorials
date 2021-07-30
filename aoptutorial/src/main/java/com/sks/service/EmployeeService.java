package com.sks.service;

import com.sks.Employee;

public class EmployeeService {
	
	private String name;
	
	private Employee employee;

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) throws Exception {
		this.name = name;
		throw new Exception();
	}
	
	
	
	

}
