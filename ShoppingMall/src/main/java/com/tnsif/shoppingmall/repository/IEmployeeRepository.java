package com.tnsif.shoppingmall.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tnsif.shoppingmall.entity.Employee;



public interface IEmployeeRepository extends JpaRepository<Employee, Integer>{

}

