package com.example.demo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.Hires;
import com.example.demo.repositories.hiresRepository;

@Service
public class hiresServices {
	@Autowired
	hiresRepository hr;
	
	public Iterable<Hires> getAllHires() {
		return hr.findAll();
	}
	
	public Optional<Hires> getHireById(String hid) {
		return hr.findByHid(hid);
	}
}
