package com.luv2code.springboot.flightList.service;

import com.luv2code.springboot.flightList.dao.FlightBookingRepository;
import com.luv2code.springboot.flightList.dao.FlightRepository;
import com.luv2code.springboot.flightList.entity.Flight;
import com.luv2code.springboot.flightList.entity.FlightBooking;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class FlightBookingServiceImpl implements FlightBookingService {

	@Autowired
	private FlightBookingRepository flightRepo;

	@Override
	public void save(FlightBooking flight) {
		flightRepo.save(flight);

	}

}
