package com.lti.AIRLINERESERVATIONSYSTEM.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="FLIGHT_SEATS")
public class Seat {
	
	@Id
	@Column(name="SEAT_NUMBER")
	private String seatNumber;

	@Column(name="FLIGHT_NUMBER")
	private String flightNumber;
	
	@Column(name="SEAT_TYPE")
	private String seatType;
	
	@Column(name="SEAT_COST")
	private long seatCost;

	public Seat() {
		super();
	}
	public Seat(String seatNumber, String flightNumber, String seatType, long seatCost) {
		super();
		this.seatNumber = seatNumber;
		this.flightNumber = flightNumber;
		this.seatType = seatType;
		this.seatCost = seatCost;
	}
	public String getSeatNumber() {
		return seatNumber;
	}
	public void setSeatNumber(String seatNumber) {
		this.seatNumber = seatNumber;
	}
	public String getFlightNumber() {
		return flightNumber;
	}
	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}
	public String getSeatType() {
		return seatType;
	}
	public void setSeatType(String seatType) {
		this.seatType = seatType;
	}
	public double getSeatCost() {
		return seatCost;
	}
	public void setSeatCost(long seatCost) {
		this.seatCost = seatCost;
	}
	@Override
	public String toString() {
		return "\n Seat [seatNumber=" + seatNumber + ", flightNumber=" + flightNumber + ", seatType=" + seatType
				+ ", seatCost=" + seatCost + "]";
	}
}
