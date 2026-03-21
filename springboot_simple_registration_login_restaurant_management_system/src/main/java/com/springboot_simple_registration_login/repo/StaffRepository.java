package com.springboot_simple_registration_login.repo;

import com.springboot_simple_registration_login.model.Staff;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StaffRepository extends JpaRepository<Staff, Long> {
	
}