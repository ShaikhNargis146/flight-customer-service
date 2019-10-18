package com.microservice.springboot.flightList.dao;

import com.microservice.springboot.flightList.entity.Bookings;
import com.microservice.springboot.flightList.entity.Passenger;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface FlightBookingRepository extends JpaRepository<Bookings, Integer> {

	List<Bookings> findByPassenger(Passenger passengerId);
}
