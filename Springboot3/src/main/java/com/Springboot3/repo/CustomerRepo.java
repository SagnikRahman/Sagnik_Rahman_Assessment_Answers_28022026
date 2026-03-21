package com.Springboot3.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Springboot3.model.Customer;

@Repository
public interface CustomerRepo extends JpaRepository<Customer, Integer> {

}
