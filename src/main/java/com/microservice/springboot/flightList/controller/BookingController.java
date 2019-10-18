package com.microservice.springboot.flightList.controller;

import com.microservice.springboot.flightList.entity.Flight;
import com.microservice.springboot.flightList.entity.Bookings;
import com.microservice.springboot.flightList.entity.Passenger;
import com.microservice.springboot.flightList.service.BookingService;
import com.microservice.springboot.flightList.service.FlightService;
import com.microservice.springboot.flightList.service.PassengerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("booking")
public class BookingController {
	
	@Autowired
	private BookingService bookingService;
	@Autowired
	private PassengerService passengerService;
	@Autowired
	private FlightService flightService;

	private static final Logger logger = LoggerFactory.getLogger(BookingController.class);

	@PostMapping("/book/{flight-id}")
	public Bookings addBooking(@PathVariable("flight-id") int flightId, @RequestBody Passenger passenger) {
		logger.info("inside addBooking-------"+flightId+passenger.getFirstName());
		RestTemplate template = new RestTemplate();
		String url= "http://localhost:9004/flights/{flight-id}";
		Map<String, String> uriparamsmap = new HashMap<String, String>();
		uriparamsmap.put("flight-id", Integer.toString(flightId));
		ResponseEntity<Flight> flightDetails = template.getForEntity(url, Flight.class, uriparamsmap);
		passengerService.save(passenger);
		Passenger thePassenger= passengerService.getByEmail(passenger.getEmail());
		Bookings flightBookings = new Bookings();
		flightBookings.setFlightNumber(flightDetails.getBody().getFlightNumber());
		flightBookings.setPassenger(thePassenger);
		bookingService.save(flightBookings);
		return flightBookings;
	}
	@GetMapping("/passenger/{passenger}")
	public @ResponseBody
	List<Bookings> getFlightBookingByPassenger(@PathVariable("passenger") int passenger) {
		return bookingService.getFlightBookingByPassenger(passengerService.findById(passenger));
	}

}
