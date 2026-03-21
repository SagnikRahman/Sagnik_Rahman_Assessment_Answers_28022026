package com.Springboot3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Springboot3.model.Customer;
import com.Springboot3.service.CustomerService;

@RestController
public class CustomerController {

	@Autowired
	private CustomerService customerService;
	
	@PostMapping("/add")
	public Customer save(@RequestBody Customer cust) {
		return customerService.save(cust);
	}
	
	@GetMapping("/display")
	public List<Customer> showAll() {
		return customerService.showAll();
	}
	
	@GetMapping("/display/{id}")
	public Customer getById(@PathVariable int id) {
		return customerService.getCustomerById(id);
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteById(@PathVariable int id) {
		customerService.deleteById(id);
	}
	
	@PatchMapping("/update")
	public void update(@RequestParam int id,@RequestParam String address) {
		customerService.update(id, address);
	}
}
