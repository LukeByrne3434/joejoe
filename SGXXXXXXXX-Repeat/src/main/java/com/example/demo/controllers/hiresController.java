package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Hires;
import com.example.demo.services.hiresServices;

@RestController
@RequestMapping (path="/hires")
public class hiresController {
	@Autowired
	hiresServices hs;
	
	@GetMapping
	public Iterable<Hires> getHires() {
		return hs.getAllHires();	
	}
	
	@GetMapping(path = "/{hid}")
	public Hires getHires(@PathVariable String hid) {
		return hs.getHireById(hid).get();
	}
	
	@Validated(HiresPOSTValidations.class)
	@PostMapping(path = "/add")
		public String addHire(@Valid @RequestBody Hires hire) {
			cs.save(hire);
			return "ok";
	}
}
