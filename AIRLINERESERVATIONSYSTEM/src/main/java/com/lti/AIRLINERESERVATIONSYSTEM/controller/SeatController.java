package com.lti.AIRLINERESERVATIONSYSTEM.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.AIRLINERESERVATIONSYSTEM.beans.Seat;
import com.lti.AIRLINERESERVATIONSYSTEM.services.SeatServiceImpl;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/seat")
public class SeatController {
	
	@Autowired
	SeatServiceImpl seatService;
	//http://localhost:8088/seat/seats
	//http://localhost:8088/seat/seatsById/A1
	@GetMapping("/seats")
	public List<Seat> listAllSeat() {
		return seatService.listAllSeat();
	}
	
	//http://localhost:8088/seat/seatsById/A1
	@GetMapping("/seatsById/{id}")
	public Seat findSeatById(@PathVariable(value = "id")String seat_Number) {
             Seat s = null;
	
		s = seatService.findSeatById(seat_Number);
		return s;
		
}
//	//http://localhost:8088/seat/addSeat
//	@PostMapping(value="/addSeat/{flightNumber}")
//	public  void addSeatWithFlight(@PathVariable(value="flightNumber")String flightNumber, @RequestBody Seat s) {
//		System.out.println("inside controler" + s);
//		seatService.addSeatWithFlight(s, flightNumber);	
//
//}
	 
	
}