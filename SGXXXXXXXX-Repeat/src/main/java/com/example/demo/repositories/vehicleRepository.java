package com.example.demo.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.models.Customer;
import com.example.demo.models.Vehicle;

public interface vehicleRepository extends CrudRepository<Vehicle, String>{
	public Optional<Vehicle> findByReg(String reg);
}
