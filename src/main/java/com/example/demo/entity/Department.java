package com.example.demo.entity;

import org.springframework.data.mongodb.core.mapping.Field;

public class Department {
	
	@Field(name= "department_name")
	private String Department_name;
	
	private String location;

	public String getDepartment_name() {
		return Department_name;
	}

	public void setDepartment_name(String department_name) {
		Department_name = department_name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	
	

}
