package com.microservice.springboot.flightList.serviceImplementation;

import com.microservice.springboot.flightList.dao.FlightRepository;
import com.microservice.springboot.flightList.entity.Flight;
import com.microservice.springboot.flightList.service.FlightNotFoundException;
import com.microservice.springboot.flightList.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class FlightServiceImpl implements FlightService {

	@Autowired
	private FlightRepository flightRepo;

	@Override
	public Flight getFlightById(int flightId) {
		return flightRepo.findById(flightId).orElseThrow(() -> new FlightNotFoundException(flightId));
	}

	@Override
	public List<Flight> getByDepartureAndArrival(String departure,String arrival) {
		return flightRepo.findByDepartureAndArrival(departure,arrival);
	}
	@Override
	public List<Flight> getAllFlights() {
		return flightRepo.findAll();
	}

	@Override
	public void save(Flight flight) {
		flightRepo.save(flight);

	}

}
