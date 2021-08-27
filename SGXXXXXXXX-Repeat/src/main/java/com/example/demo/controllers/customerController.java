package com.example.demo.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Customer;
import com.example.demo.models.validations.CustomerPOSTValidations;
import com.example.demo.services.CustomerService;

@RestController
@Validated
@RequestMapping (path="/customer")
public class customerController {
	@Autowired
	CustomerService cs;
	
	@GetMapping
	public Iterable<Customer> getCustomer() {
		return cs.getAllCustomers();	
	}
	
	@GetMapping(path = "/{cid}")
	public Customer getCustomer(@PathVariable String cid) {
		return cs.getCustomerById(cid).get();
	}
	
	@Validated(CustomerPOSTValidations.class)
	@PostMapping(path = "/add")
		public String addCustomer(@Valid @RequestBody Customer customer) {
			cs.save(customer);
			return "ok";
	}
	
	@PutMapping(path = "/{cid}")
	public String updateCustomer(@PathVariable String cid, @Valid @RequestBody Customer c) {
		cs.updateCust(cid, c);
		return "ok";
	}
	
	
	
	
	
}