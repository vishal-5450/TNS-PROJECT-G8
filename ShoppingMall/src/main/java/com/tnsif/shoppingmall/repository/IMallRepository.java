package com.tnsif.shoppingmall.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tnsif.shoppingmall.entity.Mall;


public interface IMallRepository extends JpaRepository<Mall, Integer>{

}
