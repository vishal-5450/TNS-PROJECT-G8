package com.tnsif.shoppingmall.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tnsif.shoppingmall.entity.Item;

//public interface IItemRepository extends JpaRepository<Item, Integer>{
//	Item addItem(Item item);
//	Item updateItem(Item item);
//	Item searchItem(int id);
//	boolean deleteItem(int id);
//}

public interface IItemRepository extends JpaRepository<Item, Integer>{

}