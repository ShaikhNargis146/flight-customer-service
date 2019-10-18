package com.microservice.springboot.flightList.service;


import com.microservice.springboot.flightList.entity.Flight;

import java.util.List;

public interface FlightService {
	
	Flight getFlightById(int flightId);

	List<Flight> getByDepartureAndArrival(String departure, String arrival);

	List<Flight> getAllFlights();

	public void save(Flight flight);

}
