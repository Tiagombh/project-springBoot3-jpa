package com.projectApril.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projectApril.project.entities.Order;


public interface OrderRepository extends  JpaRepository<Order, Long> {

}
