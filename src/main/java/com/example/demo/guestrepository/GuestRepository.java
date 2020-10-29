package com.example.demo.guestrepository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.GuestEntity;

public interface GuestRepository extends CrudRepository<GuestEntity, Long>{

	
}
