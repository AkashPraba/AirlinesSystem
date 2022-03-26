package com.lti.AIRLINERESERVATIONSYSTEM.services;

import java.util.List;

import com.lti.AIRLINERESERVATIONSYSTEM.beans.Flight;
import com.lti.AIRLINERESERVATIONSYSTEM.exceptions.CustomFlightException;

public interface FlightService {

	public abstract Flight addFlight(Flight f);
	
	public abstract int addFlightsWithAdmin(Flight f, int adminId);
	
	public abstract Flight findFlightById(int flight_Number);
	
	public List<Flight> listAllFlight();
	
	public abstract String updateFlight(int flight_Number, String destination) throws CustomFlightException;
	
	public int deleteById(int flightId);
}
