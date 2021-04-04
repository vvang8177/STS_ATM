package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface userRepo extends JpaRepository<User, Long> {
	
	@Query("SELECT u FROM User u WHERE u.user_email = ?1")
	User findByEmail(String email);
}
