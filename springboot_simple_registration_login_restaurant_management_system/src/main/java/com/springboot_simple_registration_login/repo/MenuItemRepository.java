package com.springboot_simple_registration_login.repo;

import com.springboot_simple_registration_login.model.MenuItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MenuItemRepository extends JpaRepository<MenuItem, Long> {
	
}