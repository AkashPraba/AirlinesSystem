package com.lti.AIRLINERESERVATIONSYSTEM.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import org.springframework.stereotype.Repository;

import com.lti.AIRLINERESERVATIONSYSTEM.beans.City;
import com.lti.AIRLINERESERVATIONSYSTEM.beans.Flight;
import com.lti.AIRLINERESERVATIONSYSTEM.beans.Passengers;
import com.lti.AIRLINERESERVATIONSYSTEM.beans.Seat;
import com.lti.AIRLINERESERVATIONSYSTEM.beans.Transaction;
import com.lti.AIRLINERESERVATIONSYSTEM.beans.Transaction2;

@Repository
public class TransactionDaoImpl2 implements TransactionDao2{

	@PersistenceContext
	private EntityManager em;
	
	
	@Override
	@Transactional
	public int addTransaction(Transaction2 t) {
		em.persist(t);
		return t.getTrId();
		
	}


	@Override
	public List<Transaction2> listAllTransaction() {
		
		String sql= "Select t From Transaction2 t";
		Query qry=em.createQuery(sql);
		List<Transaction2>TransList=qry.getResultList();
		System.out.println("on db server"+TransList);
		return TransList;
	}


	@Override
	public Transaction2 findTransactionId(int Trans_id) {
		System.out.println("*Found*");
		Transaction2 a=em.find(Transaction2.class,Trans_id);
		return a;
	}

	/*
	 * @Override
	 * 
	 * @Transactional public int UpdatecityId(int TrId, int cityId) { Transaction
	 * trans1 = em.find(Transaction.class, TrId); trans1.setTfair(cityId);
	 * em.merge(trans1); return trans1.getCityId(); }
	 */


	@Override
	@Transactional
	public void deleteById(int TrId) {
		Transaction2 user=em.find(Transaction2.class, TrId);
		em.remove(user);
		
	}


	
	/*
	 * @Override
	 * 
	 * @Transactional public Transaction2 addTransactionFk(Transaction2 t, String
	 * passId, String flightNo, String seatNo, int cityId) { Passengers p =
	 * em.find(Passengers.class, passId); Flight f = em.find(Flight.class,
	 * flightNo); Seat s = em.find(Seat.class, seatNo); City c = em.find(City.class,
	 * cityId);
	 * 
	 * if (p == null || f == null || s == null || c == null) {
	 * 
	 * System.out.println(); } else {
	 * 
	 * t.setPassangerId(p); t.setFlightNo(f); t.setSeatNo(s); t.setCityId(c);
	 * em.persist(t); }
	 * 
	 * return t; }
	 */

}