package com.airport.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.airport.model.Passenger;
import com.airport.service.PassenserService;


@RestController
public class PassengerController {
	
	@Autowired
	PassenserService passenserService;
	
	@PostMapping("/addStudent")
	Passenger addpass(@RequestBody Passenger passenger) {
		
		passenger=passenserService.addpass(passenger);
		return passenger;
	}
	@GetMapping("/getpass")
	Optional<Passenger> getpassbyid(@RequestParam Integer passengerid) {
		
		Optional<Passenger> passenger=passenserService.getpassbyid(passengerid);
		
		return passenger;
	}
	@DeleteMapping("/deleteStudent")
	Integer deletebyid(@RequestParam Integer passengerid) {
		
		Integer passenger=passenserService.deletebyid(passengerid);
		return passenger;
	}
	@PutMapping("/updatepassenger")
	Passenger updatepassenger (@RequestBody Passenger passenger ) {
		passenserService.updatePassenger(passenger);
		return passenger;
	}

}
