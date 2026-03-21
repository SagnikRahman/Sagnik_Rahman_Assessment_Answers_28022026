package com.Springboot3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Springboot3.model.Customer;
import com.Springboot3.repo.CustomerRepo;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepo customerRepo;
	
	public Customer save(Customer customer) {
		return customerRepo.save(customer);
	}
	
	public List<Customer> showAll() {
		return customerRepo.findAll();
	}
	
	public Customer getCustomerById(int id) {
		return customerRepo.findById(id).orElse(null);
	}
	
	public void update(int id, String address) {
		Customer cust = customerRepo.findById(id).orElse(null);
		if(cust!=null) {
			cust.setAddress(address);
			customerRepo.save(cust);
		}
	}
	
	public void deleteById(int id) {
		customerRepo.deleteById(id);
	}
}
