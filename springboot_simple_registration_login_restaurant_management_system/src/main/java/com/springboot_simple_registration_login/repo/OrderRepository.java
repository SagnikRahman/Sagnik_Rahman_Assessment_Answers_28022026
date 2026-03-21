package com.springboot_simple_registration_login.repo;

import com.springboot_simple_registration_login.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
	
}