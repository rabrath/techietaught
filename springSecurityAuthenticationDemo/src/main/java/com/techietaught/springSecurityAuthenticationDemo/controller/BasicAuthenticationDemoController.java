package com.techietaught.springSecurityAuthenticationDemo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techietaught.springSecurityAuthenticationDemo.model.Customer;

@RestController
@RequestMapping("/basic/auth")
public class BasicAuthenticationDemoController {

	@GetMapping("/hello")
	public String hello() {
		return "Welcome to Spring Security Basic Authentication Demo!!";
	}
	
	@PostMapping("/create")
	public ResponseEntity<Customer> createCustomer(@RequestBody Customer customer) {
		return ResponseEntity.ok(customer);
	}
}
