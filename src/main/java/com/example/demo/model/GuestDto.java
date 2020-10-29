package com.example.demo.model;

import java.time.LocalDateTime;

public class GuestDto {
	
	private Long id;
	
	private String name;
	
	private LocalDateTime dt;
	
	private String ip;

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

	public LocalDateTime getDt() {
		return dt;
	}

	public void setDt(LocalDateTime dt) {
		this.dt = dt;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	@Override
	public String toString() {
		return "GuestDto [id=" + id + ", name=" + name + ", dt=" + dt + ", ip=" + ip + "]";
	}


}
