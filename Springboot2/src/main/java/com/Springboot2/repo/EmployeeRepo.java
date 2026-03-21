package com.Springboot2.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.Springboot2.model.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer> {
	
	@Query("SELECT e FROM Employee e ORDER BY e.name ASC")
    List<Employee> findAllSorted();
	
	@Query("SELECT e.name, e.email FROM Employee e WHERE e.email LIKE '%ha%'")
	List<Object[]> findList();
}
