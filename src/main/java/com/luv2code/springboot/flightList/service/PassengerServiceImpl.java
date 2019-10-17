package com.luv2code.springboot.flightList.service;

import com.luv2code.springboot.flightList.dao.PassengerRepository;
import com.luv2code.springboot.flightList.entity.Flight;
import com.luv2code.springboot.flightList.entity.Passenger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional(readOnly = true)
public class PassengerServiceImpl implements PassengerService {

	@Autowired
	private PassengerRepository passengerRepository;

	@Override
	public Passenger getByEmail(String email) {
		return passengerRepository.findByEmail(email);
	}

	@Override
	public void save(Passenger passenger) {
		passengerRepository.save(passenger);

	}
}
