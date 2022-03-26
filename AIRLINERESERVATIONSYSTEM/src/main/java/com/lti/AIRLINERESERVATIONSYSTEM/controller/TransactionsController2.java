package com.lti.AIRLINERESERVATIONSYSTEM.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.AIRLINERESERVATIONSYSTEM.beans.Admin;
import com.lti.AIRLINERESERVATIONSYSTEM.beans.Transaction;
import com.lti.AIRLINERESERVATIONSYSTEM.beans.Transaction2;
import com.lti.AIRLINERESERVATIONSYSTEM.services.TransactionServiceImpl2;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/tra2")
public class TransactionsController2 {

	@Autowired
	TransactionServiceImpl2 TransactionService;

	// http://localhost:8090/tra2/t1
	@GetMapping("/t2")
	public List<Transaction2> listAllTransaction() {
		List<Transaction2> traList = TransactionService.listAllTransaction();
		return traList;

	}

	// http://localhost:8090/tra2/findId2/111
	@GetMapping("/findId2/{id}")
	public Transaction2 findTransactionId(@PathVariable(value = "id") int Trans_id) {
		Transaction2 a = null;
		a = TransactionService.findTransactionId(Trans_id);
		return a;
	}

	// http://localhost:8090/tra2/addtransaction
	@PostMapping("/addtransaction")
	public int addTransaction(@RequestBody Transaction2 t) {
		return TransactionService.addTransaction(t);
	}
	
}