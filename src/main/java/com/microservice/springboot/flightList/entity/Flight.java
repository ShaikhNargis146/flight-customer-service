package com.microservice.springboot.flightList.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name="flight")
public class Flight {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
	private Integer id;
	@Column(name = "departure")
	private String departure;
	@Column(name = "arrival")
	private String arrival;
	@Column(name = "departure_date")
	private LocalDateTime departureDate;
	@Column(name = "arrival_date")
	private LocalDateTime arrivalDate;
	@Column(name = "flight_number")
	private String flightNumber;
//	@ManyToMany(mappedBy = "flights", fetch = FetchType.LAZY)
//	private Set<FlightBooking> bookings;

	public Flight() {
		super();
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDeparture() {
		return departure;
	}

	public Flight(Integer id, String departure, String arrival, LocalDateTime departureDate, LocalDateTime arrivalDate, String flightNumber) {
		this.id = id;
		this.departure = departure;
		this.arrival = arrival;
		this.departureDate = departureDate;
		this.arrivalDate = arrivalDate;
		this.flightNumber = flightNumber;
	}

	public void setDeparture(String departure) {
		this.departure = departure;
	}

	public String getArrival() {
		return arrival;
	}

	public void setArrival(String arrival) {
		this.arrival = arrival;
	}

	public LocalDateTime getDepartureDate() {
		return departureDate;
	}

	public void setDepartureDate(LocalDateTime departureDate) {
		this.departureDate = departureDate;
	}

	public LocalDateTime getArrivalDate() {
		return arrivalDate;
	}

	public void setArrivalDate(LocalDateTime arrivalDate) {
		this.arrivalDate = arrivalDate;
	}

	public String getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	@Override
	public String toString() {
		return "Flight{" +
				"id=" + id +
				", departure='" + departure + '\'' +
				", arrival='" + arrival + '\'' +
				", departureDate=" + departureDate +
				", arrivalDate=" + arrivalDate +
				", flightNumber='" + flightNumber + '\'' +
				'}';
	}
}





