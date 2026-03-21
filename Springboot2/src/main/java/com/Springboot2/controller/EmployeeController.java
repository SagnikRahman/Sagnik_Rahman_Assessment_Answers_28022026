package com.Springboot2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Springboot2.model.Employee;
import com.Springboot2.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping("/add")
	public Employee save(@RequestBody Employee emp) {
		return employeeService.save(emp);
	}
	
	@GetMapping("/display")
	public List<Employee> showAll() {
		return employeeService.showAll();
	}
	
	@GetMapping("/display/{id}")
	public Employee getById(@PathVariable int id) {
		return employeeService.getEmployeeById(id);
	}
	
	@GetMapping("/employee/sorted")
	public List<Employee> sorted() {
	    return employeeService.getSorted();
	}
	
	@GetMapping("/employee/name/email")
	public List<Object[]> getNameEmail() {
		return employeeService.getNameEmail();
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteById(@PathVariable int id) {
		employeeService.deleteById(id);
	}
	
	@PatchMapping("/update")
	public void update(@RequestParam int id,@RequestParam String name) {
		employeeService.update(id, name);
	}
	
	@PutMapping("/update-all")
	public void updateAll(@RequestParam int id,@RequestParam String name,@RequestParam String mobile,@RequestParam String email) {
		employeeService.updateAll(id, name, mobile, email);
	}
}
