package com.luv2code.springboot.flightList.rest;

import com.luv2code.springboot.flightList.entity.FlightBooking;
import com.luv2code.springboot.flightList.entity.Passenger;
import com.luv2code.springboot.flightList.service.FlightBookingService;
import com.luv2code.springboot.flightList.service.FlightService;
import com.luv2code.springboot.flightList.service.PassengerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("booking")
public class FlightBookingController {
	
	@Autowired
	private FlightBookingService flightBookingService;
	@Autowired
	private PassengerService passengerService;
	@Autowired
	private FlightService flightService;

	private static final Logger logger = LoggerFactory.getLogger(FlightBookingController.class);

	@PostMapping("/book/{flight-id}")
	public FlightBooking addBooking(@PathVariable("flight-id") int flightId,@RequestBody Passenger passenger) {
		System.out.println("addBooking-------"+flightId+passenger.getFirstName());
		passengerService.save(passenger);
		Passenger thePassenger= passengerService.getByEmail(passenger.getEmail());
		FlightBooking flightBooking = new FlightBooking();
		flightBooking.setFlight(flightService.getFlightById(flightId));
		flightBooking.setPassenger(thePassenger);
		flightBookingService.save(flightBooking);
		return flightBooking;
	}
}
