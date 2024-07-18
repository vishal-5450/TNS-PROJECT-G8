package com.tnsif.shoppingmall.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tnsif.shoppingmall.entity.Item;
import com.tnsif.shoppingmall.repository.IItemRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class ItemService {
	@Autowired
	private IItemRepository repo;
	
	
	public List<Item> listAll(){
		return repo.findAll();
	}
	
	public void save(Item item)  {
		repo.save(item);
	}   
	
	public Item get(Integer id) {
		return repo.findById(id).get();
	}
	 public void delete(Integer id) 
	 {
	 repo.deleteById(id);
	 }
}
