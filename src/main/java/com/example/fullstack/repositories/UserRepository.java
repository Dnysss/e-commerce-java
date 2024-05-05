package com.example.fullstack.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.fullstack.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}
