package com.microservice.springboot.flightList.entity;

import javax.persistence.*;

@Entity
public class Bookings {
	@Id
	@GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY )
	@Column(name="id")
	private Integer id;
	@ManyToOne
	@JoinColumn(name="passengerId", nullable=false)
	private Passenger passenger;
	private String flightNumber;

	public Bookings() {
		super();
	}

	public Bookings(Integer id, Passenger passenger, String flightNumber) {
		this.id = id;
		this.passenger = passenger;
		this.flightNumber = flightNumber;
	}

	public Passenger getPassenger() {
		return passenger;
	}

	public void setPassenger(Passenger passenger) {
		this.passenger = passenger;
	}

	public String getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	@Override
	public String toString() {
		return "Bookings{" +
				"id=" + id +
				", passenger=" + passenger +
				", flightNumber='" + flightNumber + '\'' +
				'}';
	}
}
