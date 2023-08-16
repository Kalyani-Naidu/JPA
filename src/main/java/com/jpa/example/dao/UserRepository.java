package com.jpa.example.dao;

import org.springframework.data.repository.CrudRepository;

import com.jpa.example.entities.User;

public interface UserRepository extends CrudRepository<User, Integer> {

}
