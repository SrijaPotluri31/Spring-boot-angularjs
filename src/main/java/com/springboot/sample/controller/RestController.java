package com.springboot.sample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.springboot.sample.model.Customer;
import com.springboot.sample.repository.CustomerRepository;
@org.springframework.web.bind.annotation.RestController
public class RestController {

	@Autowired
	CustomerRepository customerRepository;
	@PostMapping("/savecustomer")
	public void saveCustomer(@RequestBody Customer customer) {
		customerRepository.save(customer);
		//return "index.html";
	}
}
