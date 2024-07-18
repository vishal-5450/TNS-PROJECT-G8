package com.tnsif.shoppingmall.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tnsif.shoppingmall.entity.Customer;
import com.tnsif.shoppingmall.services.ICustomerService;



@RestController

public class ICustomerController {

	@Autowired
	ICustomerService customerService;
	
	@PostMapping("/customer")
	public void createCustomer(@RequestBody Customer customer) {
		customerService.saveCustomer(customer);
	}
	
	@GetMapping("/readCustomerById/{id}")
	public Customer readCustomerById(@PathVariable(name="id") int id) {
		return customerService.readCustomerDataById(id);
	}
	
	@PutMapping("/updateCustomer/{id}")
	public void updateCustomer(@RequestBody Customer customer,@PathVariable(name="id") int id) {
		customerService.updateCustomer(customer, id);
	}
	
	@DeleteMapping("/deleteCustomer/{id}")
	public void deleteCustomer(@PathVariable(name="id") int id) {
		customerService.deleteCustomer(id);
	}
	
	@GetMapping("/readAllCustomer")
	public List<Customer> readAllCustomerData(){
		return customerService.readAllCustomerData();
	}
}
