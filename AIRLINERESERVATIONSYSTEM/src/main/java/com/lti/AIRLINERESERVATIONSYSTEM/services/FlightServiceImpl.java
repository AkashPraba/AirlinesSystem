package com.lti.AIRLINERESERVATIONSYSTEM.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.AIRLINERESERVATIONSYSTEM.beans.Flight;
import com.lti.AIRLINERESERVATIONSYSTEM.dao.FlightDao;
import com.lti.AIRLINERESERVATIONSYSTEM.exceptions.CustomFlightException;

@Service("flightService")
public class FlightServiceImpl implements FlightService{
	
	@Autowired
	FlightDao dao;
	public FlightDao getDao() {
		return dao;
	}

	public void setDao(FlightDao dao) {
		this.dao = dao;
	}

	@Override
	public Flight addFlight(Flight f) {
	
		return dao.addFlight(f);
	}

	@Override
	public Flight findFlightById(int flight_Number) {
		
		Flight f = dao.findFlightById(flight_Number);
		return f;
	}

	@Override
	public List<Flight> listAllFlight() {
		List<Flight> flight = dao.listAllFlight();
		return flight;
	}

	@Override
	public String updateFlight(int flight_Number, String destination) throws CustomFlightException {
		String flight = dao.updateFlight(flight_Number, destination);
		//Double emp = dao.updateSalary(empNo, sal);
		return flight;
	}

	
	@Override
	public int deleteById(int flightId) {
		int del = dao.deleteById(flightId);
		return del;
	}

	@Override
	public int addFlightsWithAdmin(Flight f, int adminId) {
		dao.addFlightsWithAdmin(f, adminId);
		return 0;
	}

}
