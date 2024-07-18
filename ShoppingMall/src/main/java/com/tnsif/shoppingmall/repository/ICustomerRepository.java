package com.tnsif.shoppingmall.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tnsif.shoppingmall.entity.Customer;



@Repository
public interface ICustomerRepository extends JpaRepository<Customer,Integer> {

}
