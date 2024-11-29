package com.infycodes.springboot_firstapp.model;

public class Student {
	
	String name;
	Integer id;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Student(String name, Integer id) {
		super();
		this.name = name;
		this.id = id;
	}
	
	

}
