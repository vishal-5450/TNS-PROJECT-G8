package com.tnsif.shoppingmall.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tnsif.shoppingmall.entity.Shop;

public interface IShopRepository extends JpaRepository<Shop, Integer> {
	
}
