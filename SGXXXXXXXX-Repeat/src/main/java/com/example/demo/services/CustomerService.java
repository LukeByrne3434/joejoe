package com.example.demo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.Customer;
import com.example.demo.repositories.CustomerRepository;

@Service
public class CustomerService {
	@Autowired
	CustomerRepository cr;
	
	public Iterable<Customer> getAllCustomers() {
		return cr.findAll();
	}
	
	public Optional<Customer> getCustomerById(String cid) {
		return cr.findByCid(cid);
	}
	
	public void save(Customer customer) {
		cr.save(customer);
	}
	
	public void updateCust(String cid, Customer c) {
		Optional<Customer> Cust = cr.findByCid(cid);
	}
}
