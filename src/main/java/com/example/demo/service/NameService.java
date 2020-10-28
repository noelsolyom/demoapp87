package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.model.NameModel;

@Service
public class NameService {

	public String welcome(NameModel name) {
		
		if(name == null || name.getName() == null || name.getName().trim().equals("")) {
			throw new IllegalArgumentException("Name must be set!");
		}
		if(name.getName().length() > 50) {
			throw new IllegalArgumentException("Name is too long!");
		}
		return "Hello " + name.getName() + " :)";
	}
}
