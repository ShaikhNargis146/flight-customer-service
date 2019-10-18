package com.microservice.springboot.flightList.controller;

import com.microservice.springboot.flightList.entity.Flight;
import com.microservice.springboot.flightList.service.FlightService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("flights")
public class FlightController {
	
	@Autowired
	private FlightService flightService;
	
	private static final Logger logger = LoggerFactory.getLogger(FlightController.class);
	
	@GetMapping
	public @ResponseBody
    List<Flight> getAllFlights() {
		System.out.println("getAllFlights-------");
		return flightService.getAllFlights();
	}
	@GetMapping("/{src}/{dest}")
	public @ResponseBody
	List<Flight> getByDepartureAndArrival(@PathVariable String src,@PathVariable  String dest) {
		System.out.println("getAllFlights-------");
		return flightService.getByDepartureAndArrival(src, dest);
	}

	@GetMapping("/{flight-id}")
	public @ResponseBody
    Flight getFlightById(@PathVariable("flight-id") int flightId) {
		return flightService.getFlightById(flightId);
	}
}
