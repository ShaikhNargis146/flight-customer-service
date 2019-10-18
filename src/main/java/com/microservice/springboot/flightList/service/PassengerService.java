package com.microservice.springboot.flightList.service;


import com.microservice.springboot.flightList.entity.Passenger;

public interface PassengerService {

	Passenger getByEmail(String email);

	public Passenger findById(int theId);


	public void save(Passenger passenger);

}
