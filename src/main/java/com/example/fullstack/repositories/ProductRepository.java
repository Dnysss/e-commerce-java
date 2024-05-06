package com.example.fullstack.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.fullstack.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
}
