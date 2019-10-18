package com.microservice.springboot.flightList.serviceImplementation;

import com.microservice.springboot.flightList.dao.FlightBookingRepository;
import com.microservice.springboot.flightList.entity.Bookings;
import com.microservice.springboot.flightList.entity.Passenger;
import com.microservice.springboot.flightList.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class BookingServiceImpl implements BookingService {

	@Autowired
	private FlightBookingRepository flightRepo;

	@Override
	public void save(Bookings flight) {
		flightRepo.save(flight);

	}

	@Override
	public List<Bookings> getFlightBookingByPassenger(Passenger passenger) {
		return flightRepo.findByPassenger(passenger);

	}
    @Override
    public List<Bookings> findAll() {
        System.out.println("findAll-------"+ flightRepo.findAll());

        return flightRepo.findAll();
    }

}
