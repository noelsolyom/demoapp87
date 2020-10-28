package com.example.demo.guestrepository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.GuestEntity;

public interface GuestRepository extends CrudRepository<GuestEntity, Long>{

	@Query("Select g FROM Guest g")
    public Iterable<GuestEntity> listGuests();
	
}
