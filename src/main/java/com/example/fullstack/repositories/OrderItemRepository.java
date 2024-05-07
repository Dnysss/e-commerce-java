package com.example.fullstack.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.fullstack.entities.OrderItem;
import com.example.fullstack.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
