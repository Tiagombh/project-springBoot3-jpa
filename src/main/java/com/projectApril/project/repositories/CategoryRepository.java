package com.projectApril.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projectApril.project.entities.Category;


public interface CategoryRepository extends  JpaRepository<Category, Long> {

}
