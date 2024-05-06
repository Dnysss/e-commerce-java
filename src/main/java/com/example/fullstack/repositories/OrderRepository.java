package com.example.fullstack.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.fullstack.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	
}
