package com.lti.AIRLINERESERVATIONSYSTEM.dao;

import java.util.List;

import com.lti.AIRLINERESERVATIONSYSTEM.beans.Seat;


public interface SeatDao {
	
	public abstract String addSeat(Seat s);
	
	public abstract Seat findSeatById(String seatNumber);
	
	public List<Seat> listAllSeat();
	
	public abstract String updateSeat(String seatNumber, long seatCost);
	
	public abstract String deleteById(String seatNumber);
}
