package com.example.fullstack.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.fullstack.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	
}
