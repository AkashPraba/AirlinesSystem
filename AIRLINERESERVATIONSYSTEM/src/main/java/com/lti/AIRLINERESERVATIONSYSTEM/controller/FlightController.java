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

import com.lti.AIRLINERESERVATIONSYSTEM.beans.Flight;
import com.lti.AIRLINERESERVATIONSYSTEM.services.FlightServiceImpl;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/flight")
public class FlightController {

		@Autowired
		FlightServiceImpl flightService;
		//http://localhost:8090/flight/flights
		@GetMapping("/flights")
		public List<Flight> listAllEmployee()
		{
			return flightService.listAllFlight();
			
		}	
		//http://localhost:8090/flight/flightsById/6E316
		@GetMapping("/flightsById/{id}")
		public Flight findFlightById(@PathVariable(value = "id")int flight_Number)
		{
			Flight f= null;
			f= flightService.findFlightById(flight_Number);
			return f;
		}
		
//		//http://localhost:8090/flight/addFlight/6E318
//		@PostMapping("/addFlight") 
//		public Flight addFlight(@RequestBody Flight f)
//		{
//			return flightService.addFlight(f);
//		}		
		
		//http://localhost:8090/flight/addFlight/6E318
		@PostMapping(value = "/addFlight/{adminid}")
		public void addFlightsWithAdmin(@PathVariable(value = "adminid") int adminId, @RequestBody Flight f)
		{
			System.out.println(f);
			flightService.addFlightsWithAdmin(f, adminId);
		}
		

		/*http://localhost:8090/flight/addFlight/11
		 * { "flightNumber": "6E318", "flightName": "IndiGo", "origin": "Pune",
		 * "destination": "Chennai", "departureDate": "2021-May-26 12:00:50. 0",
		 * "arrivalDate": "2021-May-26 2:30:50. 0", "returnDate":
		 * "2021-May-27 7:45:50. 0",
		 * 
		 * "admin": { "adminId": 11 } }
		 */
		
}

