package com.microservice.springboot.flightList.service;


import com.microservice.springboot.flightList.entity.Bookings;
import com.microservice.springboot.flightList.entity.Passenger;

import java.util.List;

public interface BookingService {

	public void save(Bookings flightBookings);

	public List<Bookings> getFlightBookingByPassenger(Passenger passenger);

	public List<Bookings> findAll();


}
