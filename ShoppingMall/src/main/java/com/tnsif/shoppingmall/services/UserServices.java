package com.tnsif.shoppingmall.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tnsif.shoppingmall.entity.User;
import com.tnsif.shoppingmall.repository.UserRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class UserServices {
    
	@Autowired
	private UserRepository repo;
	
	
	public List<User> listAll(){
		return repo.findAll();
	}
	
	public void save(User user)  {
		repo.save(user);
	}   
	
	public User get(Integer id) {
		return repo.findById(id).get();
	}
	 public void delete(Integer id) 
	 {
	 repo.deleteById(id);
	 }
	
}