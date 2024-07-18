package com.tnsif.shoppingmall.controller;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;


import com.tnsif.shoppingmall.entity.User;
import com.tnsif.shoppingmall.exception.UserNotFound;
import com.tnsif.shoppingmall.repository.UserRepository;
import com.tnsif.shoppingmall.services.UserServices;

@RestController
@RequestMapping
public class UserController {
	@Autowired
	UserServices services;
	
	@Autowired
	UserRepository userRepository ;
	
	@GetMapping("/users")
   public List<User> list(){
	return services.listAll();
   }
	
	 @GetMapping("/users/{id}")
	 public ResponseEntity<User> get(@PathVariable Integer id) 
	 {
	 try
	 {
	 User user = services.get(id);
	 return new ResponseEntity<User>(user, HttpStatus.OK);
	 } 

	 catch(UserNotFound ex)
	 {
		
		 return new ResponseEntity<User>( HttpStatus.NOT_FOUND);
	 }
	 }
	 
	 @PostMapping("/users")
	 @ResponseStatus(code =HttpStatus.CREATED)
	 public void add(@RequestBody User user) 
	 {
	 services.save(user);
	 }
	 
	 
	 @PutMapping("/users/{id}")
	 @ResponseStatus(code =HttpStatus.CREATED)
	 public ResponseEntity<?> update(@RequestBody User user, @PathVariable Integer id) 
	 {
	 try
	 {
	 User existuser = services.get(id);
	 existuser.setName(user.getName());
	 existuser.setType(user.getType());
	 existuser.setPassword(user.getPassword());
	 services.save(existuser);
	 return new ResponseEntity<>(HttpStatus.OK);
	 } 
	 catch (NoSuchElementException e) 
	 {
	 return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	 } 
	 }
	 
	 @DeleteMapping("/users/{id}")
	 public void delete(@PathVariable Integer id) //extracting ID from the URL
	 {
	 services.delete(id);
	 }
	 
	 
	 
	 
	
	
	
}