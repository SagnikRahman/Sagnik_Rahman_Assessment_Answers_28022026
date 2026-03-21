package com.springboot_simple_registration_login.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import com.springboot_simple_registration_login.model.User;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
}