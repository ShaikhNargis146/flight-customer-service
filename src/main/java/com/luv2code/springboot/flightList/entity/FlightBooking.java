package com.luv2code.springboot.flightList.entity;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import javax.persistence.*;
import java.util.Set;

@Entity
public class FlightBooking {
	@Id
	@GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY )
	@Column(name="id")
	private Integer id;
	@ManyToOne
	private Passenger passenger;
	@ManyToOne
	private Flight flight;

	public FlightBooking() {
		super();
	}

	public FlightBooking(Integer id, Passenger passenger, Flight flight) {
		this.id = id;
		this.passenger = passenger;
		this.flight = flight;
	}

	public Passenger getPassenger() {
		return passenger;
	}

	public void setPassenger(Passenger passenger) {
		this.passenger = passenger;
	}

	public Flight getFlight() {
		return flight;
	}

	public void setFlight(Flight flight) {
		this.flight = flight;
	}

	@Override
	public String toString() {
		return "FlightBooking [id=" + id + ", passenger=" + passenger + "]";
	}

}
