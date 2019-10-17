package com.luv2code.springboot.flightList.dao;

import com.luv2code.springboot.flightList.entity.FlightBooking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface FlightBookingRepository extends JpaRepository<FlightBooking, Integer> {

	List<FlightBooking> findByPassengerId(int passengerId);
}
