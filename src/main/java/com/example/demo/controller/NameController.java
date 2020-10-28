package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.NameModel;
import com.example.demo.model.WelcomeResponse;
import com.example.demo.service.NameService;

@RestController
@RequestMapping(value = "/")
public class NameController {
	
	@Autowired
	NameService service;

	@PostMapping(value = "/welcome", produces = "application/json")
	public WelcomeResponse controller(@RequestBody NameModel name) {

		WelcomeResponse resp = new WelcomeResponse();
		try {
		String s = service.welcome(name);
		resp.setResp(s);
		return resp;
		} catch (Exception e) {
			resp.setResp(e.getMessage());
			return resp;
		}
		
	}
	
}
