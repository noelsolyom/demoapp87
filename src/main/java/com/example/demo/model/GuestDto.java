package com.example.demo.model;

public class GuestDto {
	
	private Long id;
	
	private String name;

	public GuestDto() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "GuestDto [id=" + id + ", name=" + name + "]";
	}

}
