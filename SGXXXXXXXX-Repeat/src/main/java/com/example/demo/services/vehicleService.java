package com.example.demo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.Hires;
import com.example.demo.models.Vehicle;
import com.example.demo.repositories.vehicleRepository;

@Service
public class vehicleService {
	@Autowired
	vehicleRepository vr;
	
	public Iterable<Vehicle> getAllVehicles() {
		return vr.findAll();
	}
	
	public Optional<Vehicle> getVehicleById(String reg) {
		return vr.findByReg(reg);
	}
}
