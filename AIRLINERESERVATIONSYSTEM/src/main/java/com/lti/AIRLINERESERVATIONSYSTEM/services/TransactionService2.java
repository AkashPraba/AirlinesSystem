package com.lti.AIRLINERESERVATIONSYSTEM.services;

import java.util.List;

import org.springframework.stereotype.Service;
import com.lti.AIRLINERESERVATIONSYSTEM.beans.Transaction;
import com.lti.AIRLINERESERVATIONSYSTEM.beans.Transaction2;

@Service("TransactionService")
public interface TransactionService2 {

	public abstract int addTransaction(Transaction2 t);

	public abstract List<Transaction2> listAllTransaction();

	public abstract Transaction2 findTransactionId(int Trans_id);

	public abstract void deleteById(int TrId);

	//public abstract String addTransactionFk(Transaction t, String passId, String flightNo, String seatNo, int cityId);

}