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

import com.tnsif.shoppingmall.entity.Item;
import com.tnsif.shoppingmall.exception.ItemNotFound;
import com.tnsif.shoppingmall.repository.IItemRepository;
import com.tnsif.shoppingmall.services.ItemService;


@RestController
public class ItemController {
	@Autowired
	ItemService services;
	
	@Autowired
	IItemRepository itemRepository ;
	
	
	@GetMapping("/item")
	   public List<Item> list(){
		return services.listAll();
	   }
	
	
	 @GetMapping("/item/{id}")
	 public ResponseEntity<Item> get(@PathVariable Integer id) 
	 {
	 try
	 {
	 Item item = services.get(id);
	 return new ResponseEntity<Item>(item, HttpStatus.OK);
	 } 

	 catch(ItemNotFound ex)
	 {
		
		 return new ResponseEntity<Item>( HttpStatus.NOT_FOUND);
	 }
	 }
	 
	 
	 
	 @PutMapping("/item/{id}")
	 @ResponseStatus(code =HttpStatus.CREATED)
	 public ResponseEntity<?> update(@RequestBody Item item, @PathVariable Integer id) 
	 {
	 try
	 {
	 Item existitem = services.get(id);
	 existitem.setName(item.getName());
	 existitem.setManufacturing(item.getManufacturing());
	 existitem.setExpiry(item.getExpiry());
	 existitem.setPrice(item.getPrice());
	 existitem.setCategory(item.getCategory());
	 services.save(existitem);
	 return new ResponseEntity<>(HttpStatus.OK);
	 } 
	 catch (NoSuchElementException e) 
	 {
	 return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	 } 
	 }
	 
	 @PostMapping("/item")
	 @ResponseStatus(code =HttpStatus.CREATED)
	 public void add(@RequestBody Item item) 
	 {
	 services.save(item);
	 }
}
