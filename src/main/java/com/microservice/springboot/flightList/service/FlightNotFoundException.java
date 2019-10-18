package com.microservice.springboot.flightList.service;


import com.microservice.springboot.flightList.exception.ResourceNotFoundException;

public class FlightNotFoundException extends ResourceNotFoundException {

	private static final long serialVersionUID = 6293499259584600291L;

	public FlightNotFoundException(int flightId) {
		super("Flight", "flight-id", flightId);
	}

}
