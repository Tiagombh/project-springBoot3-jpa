package com.projectApril.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projectApril.project.entities.Product;


public interface ProductRepository extends  JpaRepository<Product, Long> {

}
