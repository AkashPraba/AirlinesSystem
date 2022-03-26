package com.lti.AIRLINERESERVATIONSYSTEM.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.AIRLINERESERVATIONSYSTEM.beans.Transaction;
import com.lti.AIRLINERESERVATIONSYSTEM.beans.Transaction2;
import com.lti.AIRLINERESERVATIONSYSTEM.dao.TransactionDao2;

@Service("TransactionService")
public class TransactionServiceImpl2 implements TransactionService2 {

	@Autowired
	TransactionDao2 dao;

	

	public TransactionDao2 getDao() {
		return dao;
	}

	public void setDao(TransactionDao2 dao) {
		this.dao = dao;
	}

	@Override
	public int addTransaction(Transaction2 t) {
		int TrId = dao.addTransaction(t);
		return TrId;

	}

	@Override
	public List<Transaction2> listAllTransaction() {
		System.out.println("service layer");
		List<Transaction2> TrasnList = dao.listAllTransaction();
		return TrasnList;
	}

	@Override
	public Transaction2 findTransactionId(int Trans_id) {
		return dao.findTransactionId(Trans_id);

	}

	@Override
	public void deleteById(int TrId) {
		dao.deleteById(TrId);

	}

	/*
	 * @Override public String addTransactionFk(Transaction t, String passId, String
	 * flightNo, String seatNo, int cityId) {
	 * 
	 * dao.addTransactionFk(t, passId, flightNo, seatNo, cityId); return "0"; }
	 */

}