package com.springboot.sample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.springboot.sample.repository.CustomerRepository;

@Controller
public class WebController {

	
	
	@GetMapping("/")
	public String homePage() {
		return "index";
	}
	
	
}
