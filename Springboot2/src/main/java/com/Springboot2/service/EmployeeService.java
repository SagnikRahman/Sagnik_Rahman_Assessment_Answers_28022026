package com.Springboot2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Springboot2.exception.NotFoundException;
import com.Springboot2.model.Employee;
import com.Springboot2.repo.EmployeeRepo;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepo employeeRepo;
	
	public Employee save(Employee emp){
		return employeeRepo.save(emp);
	}
	
	public List<Employee> showAll()	{
		return employeeRepo.findAll();
	}
	
	public Employee getEmployeeById(int id) {
		return employeeRepo.findById(id).orElseThrow(() -> new NotFoundException("Employee with ID " + id + " not found"));
	}
	
	public List<Employee> getSorted() {
	    return employeeRepo.findAllSorted();
	}
	
	public List<Object[]> getNameEmail() {
		return employeeRepo.findList();
	}
	
	public void deleteById(int id) {
		employeeRepo.deleteById(id);
	}
	
	public void update(int id, String name) {
		Employee emp = employeeRepo.findById(id).orElseThrow(() -> new NotFoundException("Employee with ID " + id + " not found for updation"));
		if(emp!=null) {
			emp.setName(name);
			employeeRepo.save(emp);
		}
	}
	
	public void updateAll(int id, String name, String mobile, String email) {
		Employee emp = employeeRepo.findById(id).orElseThrow(() -> new NotFoundException("Employee with ID " + id + " not found for updation of all details"));
		if(emp!=null) {
			emp.setName(name);
			emp.setMobile(mobile);
			emp.setEmail(email);
			employeeRepo.save(emp);
		}
	}
}
