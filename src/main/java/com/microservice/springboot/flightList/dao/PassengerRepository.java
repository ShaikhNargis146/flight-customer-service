package com.microservice.springboot.flightList.dao;

import com.microservice.springboot.flightList.entity.Passenger;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface PassengerRepository extends JpaRepository<Passenger, Integer> {
	
	Passenger findByEmail(String email);
	
}
