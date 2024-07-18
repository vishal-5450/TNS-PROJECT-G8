package com.tnsif.shoppingmall.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tnsif.shoppingmall.entity.User;


public interface UserRepository extends JpaRepository<User, Integer>{

}