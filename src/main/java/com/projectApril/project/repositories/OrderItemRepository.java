package com.projectApril.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projectApril.project.entities.OrderItem;


public interface OrderItemRepository extends  JpaRepository<OrderItem, Long> {

}
