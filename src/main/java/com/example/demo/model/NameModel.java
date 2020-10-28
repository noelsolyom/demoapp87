package com.example.demo.model;

public class NameModel {
	
	private String name;

	public NameModel() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "NameModel [name=" + name + "]";
	}
	
	
}
