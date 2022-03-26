package com.lti.AIRLINERESERVATIONSYSTEM.dao;

import java.util.List;

import com.lti.AIRLINERESERVATIONSYSTEM.beans.Passengers;

public interface PassengerDao {
	
	public abstract int addPassengers(Passengers p);

	public abstract Passengers findPassengerById(int passId);
  
	public abstract List<Passengers> listAllPassengers();

    public String updateFirstName(int passId,String fName);
  
    public abstract int deleteById(int passId);
}
