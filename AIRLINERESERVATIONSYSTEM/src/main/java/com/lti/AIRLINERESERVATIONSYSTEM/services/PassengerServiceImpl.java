package com.lti.AIRLINERESERVATIONSYSTEM.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.AIRLINERESERVATIONSYSTEM.beans.Passengers;
import com.lti.AIRLINERESERVATIONSYSTEM.dao.PassengerDao;

@Service("passService")
public class PassengerServiceImpl implements PassengerService{

	
	@Autowired
	PassengerDao dao;
	
	public PassengerDao getDao() {
		return dao;
	}

	public void setDao(PassengerDao dao) {
		this.dao = dao;
	}
	@Override
	
	 public int addPassengers(Passengers p) {
		  System.out.println("Service layer");
		  int passId= dao.addPassengers(p);
		  return passId;
	  }

	@Override
	public Passengers findPassengerById(int passId) {
		Passengers p= dao.findPassengerById(passId);
		return p;
	}

	@Override
	public List<Passengers> listAllPassengers() {
		List<Passengers> passList=dao.listAllPassengers();
		return passList ;
	}

	@Override
	public String updateFirstName(int passId, String fName) {
		String fn=dao.updateFirstName(passId,fName);
		return fn;
	}

	@Override
	public int deleteById(int passId) {
	int p=dao.deleteById(passId);
	return p;
		
	}
}
