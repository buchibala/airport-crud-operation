package com.airport.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.airport.model.Passenger;
import com.airport.repository.PassengerRepository;

@Service
public class PassenserService {
	
	@Autowired
	PassengerRepository passengerRepository;

	

	public Passenger addpass(Passenger passenger) {
		
		passengerRepository.save(passenger);
		return passenger;
	}

	public Optional<Passenger> getpassbyid(Integer passengerid) {
		
		Optional<Passenger> getpass=passengerRepository.findById(passengerid);
		return getpass;
	}

	public Integer deletebyid(Integer passengerid) {
		 
		passengerRepository.deleteById(passengerid);;
		return passengerid;
	}

	public Passenger updatePassenger(Passenger passenger) {
		
		passengerRepository.save(passenger);
		return passenger;
		
		
	}

	
	
	

	
}
