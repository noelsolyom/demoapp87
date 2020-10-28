package com.example.demo.model;

public class WelcomeResponse {

	private String resp;
	
	public WelcomeResponse() {
		super();
	}

	public String getResp() {
		return resp;
	}

	public void setResp(String resp) {
		this.resp = resp;
	}

	@Override
	public String toString() {
		return "WelcomeResponse [resp=" + resp + "]";
	}

	
}
