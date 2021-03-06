package com.example.demo.service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.guestrepository.GuestRepository;
import com.example.demo.model.GuestDto;
import com.example.demo.model.GuestEntity;
import com.example.demo.model.NameModel;

@Service
public class NameService {
	
	@Autowired
	GuestRepository guestRepository;

	public String welcome(NameModel name, HttpServletRequest request) {
		
		if(name == null || name.getName() == null || name.getName().trim().equals("")) {
			throw new IllegalArgumentException("Name must be set!");
		}
		if(name.getName().length() > 50) {
			throw new IllegalArgumentException("Name is too long!");
		}
		try {
		GuestEntity newGuest = new GuestEntity();
		newGuest.setName(name.getName());
		newGuest.setDt(name.getDt());
		newGuest.setIp(request.getRemoteAddr());
		guestRepository.save(newGuest);
		} catch (Exception e) {
			throw e;
		}
		return "Hello " + name.getName() + " :)";
	}
	
	public List<GuestDto> listGuests() {
		Iterable<GuestEntity> guests = guestRepository.findAll();
		List<GuestEntity> guestList = new ArrayList<>();
		guests.forEach(guestList::add);
		
		List<GuestDto> guestResp = new ArrayList<>();
		for(GuestEntity g: guestList) {
			GuestDto guestDto = new GuestDto();
			guestDto.setId(g.getId());
			guestDto.setName(g.getName());
			guestDto.setDt(g.getDt());
			guestDto.setIp(g.getIp());
			guestResp.add(guestDto);
		}
		
		return guestResp;
		
	}
}
