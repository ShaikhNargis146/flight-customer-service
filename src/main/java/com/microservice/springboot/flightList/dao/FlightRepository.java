package com.microservice.springboot.flightList.dao;

import com.microservice.springboot.flightList.entity.Flight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface FlightRepository extends JpaRepository<Flight, Integer> {
	
	List<Flight> findByDepartureAndArrival(String departure, String arrival);
}
