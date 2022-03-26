package com.lti.AIRLINERESERVATIONSYSTEM.dao;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.AIRLINERESERVATIONSYSTEM.beans.Passengers;

@Repository
public class PassengerDaoImpl implements PassengerDao {
     
	@PersistenceContext
	EntityManager em;
	
	@Override
	@Transactional
	public int addPassengers(Passengers p) {
		em.persist(p);
		return p.getPassId();
		
	}

	@Override
	public Passengers findPassengerById(int passId) {
		Passengers p=em.find(Passengers.class,passId);
		return p;
	}

	@Override
	public List<Passengers> listAllPassengers() {
		String sql="Select p From Passengers p";
		Query qry=em.createQuery(sql);
		List<Passengers> passList=qry.getResultList();
		//System.out.println("On do server: "+passList);
		return passList;
	}

	@Override
	@Transactional
	public String updateFirstName(int passId, String fName) {
		Passengers pass =em.find(Passengers.class,passId);
		pass.setfName(fName);
		em.merge(pass);
		return pass.getfName();
	}

	@Override
	@Transactional
	public int deleteById(int passId) {
		Passengers p=em.find(Passengers.class,passId);
		 em.remove(p);
		return p.getPassId(); 
		
	}

}
