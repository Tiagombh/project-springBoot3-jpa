package com.projectApril.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projectApril.project.entities.User;


public interface UserRepository extends  JpaRepository<User, Long> {

}
