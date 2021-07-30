package com.sks;

public class Employee {
	
	private String name;
	private String surName;

	public String getName() {
		return name;
	}

	public void setName(String name) throws Exception {
		this.name = name;
		if(name.equals("Amar")) {
			
			throw new Exception();
			
		}
	}
	
	public void setFullName(String name, String surName) {
		this.name = name;
		this.surName = surName;
	}
	
	

	public String getSurName() {
		return surName;
	}

	public void setSurName(String surName) {
		this.surName = surName;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", surName=" + surName + "]";
	}

	
	
	

}
