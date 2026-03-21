package com.springboot_simple_registration_login.repo;

import com.springboot_simple_registration_login.model.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
	
}