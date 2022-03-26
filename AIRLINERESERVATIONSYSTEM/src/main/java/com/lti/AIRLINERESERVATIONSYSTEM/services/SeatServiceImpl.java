package com.lti.AIRLINERESERVATIONSYSTEM.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.AIRLINERESERVATIONSYSTEM.beans.Seat;
import com.lti.AIRLINERESERVATIONSYSTEM.dao.SeatDao;


@Service("seatService")
public class SeatServiceImpl implements SeatService{

	@Autowired
	SeatDao dao;
	
	@Override
	public String addSeat(Seat s) {
		String seat = dao.addSeat(s);
		return seat;
	}

	@Override
	public Seat findSeatById(String seatNumber) {
		Seat seat = dao.findSeatById(seatNumber);
		return seat;
	}

	@Override
	public List<Seat> listAllSeat() {
		List<Seat> list = dao.listAllSeat();
		return list;
	}

	@Override
	public String updateSeat(String seatNumber, long seatCost) {
		String seat = dao.updateSeat(seatNumber, seatCost);
		return seat;
	}

	@Override
	public String deleteById(String seatNumber) {
		String del = dao.deleteById(seatNumber);
		return del;
	}

}
