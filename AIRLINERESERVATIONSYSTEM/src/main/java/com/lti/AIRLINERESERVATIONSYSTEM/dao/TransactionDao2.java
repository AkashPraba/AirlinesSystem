package com.lti.AIRLINERESERVATIONSYSTEM.dao;

import java.util.List;

import com.lti.AIRLINERESERVATIONSYSTEM.beans.Transaction2;


public interface TransactionDao2 {

	public abstract int addTransaction(Transaction2 t);
	public abstract List<Transaction2> listAllTransaction();
	public abstract Transaction2 findTransactionId(int Trans_id);
	public abstract void  deleteById(int TrId);
	
	/*
	 * public abstract Transaction2 addTransactionFk(Transaction t, String passId,
	 * String flightNo, String seatNo, int cityId);
	 */
}