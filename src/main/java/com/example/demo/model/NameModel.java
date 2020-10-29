package com.example.demo.model;

import java.time.LocalDateTime;

public class NameModel {
	
	private String name;
	
	private LocalDateTime dt;

	public NameModel() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDateTime getDt() {
		return dt;
	}

	public void setDt(LocalDateTime dt) {
		this.dt = dt;
	}

	@Override
	public String toString() {
		return "NameModel [name=" + name + "]";
	}

}
