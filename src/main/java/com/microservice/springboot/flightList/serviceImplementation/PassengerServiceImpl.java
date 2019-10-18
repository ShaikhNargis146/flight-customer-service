package com.microservice.springboot.flightList.serviceImplementation;

import com.microservice.springboot.flightList.dao.PassengerRepository;
import com.microservice.springboot.flightList.entity.Passenger;
import com.microservice.springboot.flightList.service.PassengerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;


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
	public Passenger findById(int theId) {
		Optional<Passenger> result = passengerRepository.findById(theId);

		Passenger theEmployee = null;

		if (result.isPresent()) {
			theEmployee = result.get();
		} else {
			throw new RuntimeException("Did not find employee id -" + theId);
		}

		return theEmployee;
	}

		@Override
	public void save(Passenger passenger) {
		passengerRepository.save(passenger);

	}
}
