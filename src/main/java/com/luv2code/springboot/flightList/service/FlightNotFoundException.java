package com.luv2code.springboot.flightList.service;


import com.luv2code.springboot.flightList.system.ResourceNotFoundException;

public class FlightNotFoundException extends ResourceNotFoundException {

	private static final long serialVersionUID = 6293499259584600291L;

	public FlightNotFoundException(int flightId) {
		super("Flight", "flight-id", flightId);
	}

}
