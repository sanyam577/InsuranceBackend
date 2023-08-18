package com.telusko.secureapp;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<SpringSecurity, Long> {

	SpringSecurity findByUsername(String username);
}
