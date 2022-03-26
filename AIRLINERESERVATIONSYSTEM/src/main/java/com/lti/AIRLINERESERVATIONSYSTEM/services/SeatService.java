package com.lti.AIRLINERESERVATIONSYSTEM.services;

import java.util.List;

import com.lti.AIRLINERESERVATIONSYSTEM.beans.Seat;



public interface SeatService {
	public abstract String addSeat(Seat s);
	
	public abstract Seat findSeatById(String seatNumber);
	
	public List<Seat> listAllSeat();
	
	public abstract String updateSeat(String seatNumber, long seatCost);
	
	public abstract String deleteById(String seatNumber);
}
