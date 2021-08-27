package com.example.demo.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.models.Customer;
import com.example.demo.models.Hires;

public interface hiresRepository extends CrudRepository<Hires, String>{
	
	public Optional<Hires> findByHid(String hid);
}
