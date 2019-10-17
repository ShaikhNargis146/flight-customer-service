package com.luv2code.springboot.flightList.service;


import com.luv2code.springboot.flightList.entity.Passenger;

public interface PassengerService {


	Passenger getByEmail(String email);

	public void save(Passenger passenger);

}
