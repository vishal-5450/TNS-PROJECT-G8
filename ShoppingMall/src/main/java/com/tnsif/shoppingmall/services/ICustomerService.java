package com.tnsif.shoppingmall.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tnsif.shoppingmall.entity.Customer;
import com.tnsif.shoppingmall.repository.ICustomerRepository;


@Service
public class ICustomerService {
	
	@Autowired
	ICustomerRepository customerRepository;
	
	public void saveCustomer(Customer customer) {
		customerRepository.save(customer);
	}
	
	public Customer readCustomerDataById(int id) {
		return customerRepository.findById(id).get();
	}
	
	public 	List<Customer> readAllCustomerData() {
		return customerRepository.findAll();
	}

	public void deleteCustomer(int id) {
		customerRepository.deleteById(id);
	}
	
	public void updateCustomer(Customer customer, int id) {
	    Customer customerToBeUpdated = readCustomerDataById(id);
	    customerToBeUpdated.setEmail(customer.getEmail());
	    customerToBeUpdated.setName(customer.getName());
	    customerToBeUpdated.setPhone(customer.getPhone());
	    customerRepository.save(customerToBeUpdated);
	}
	
}
