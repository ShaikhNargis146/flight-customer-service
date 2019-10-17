package com.luv2code.springboot.flightList.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;

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
	
//	@ManyToMany(mappedBy = "flights", fetch = FetchType.LAZY)
//	private Set<FlightBooking> bookings;

	public Flight() {
		super();
	}

	public Flight(int id, String departure, String arrival, LocalDateTime departureDate, LocalDateTime arrivalDate) {
		super();
		this.id = id;
		this.departure = departure;
		this.arrival = arrival;
		this.departureDate = departureDate;
		this.arrivalDate = arrivalDate;
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

	@Override
	public String toString() {
		return "Flight [id=" + id + ", departure=" + departure + ", arrival=" + arrival + ", departureDate="
				+ departureDate + ", arrivalDate=" + arrivalDate + "]";
	}

}





