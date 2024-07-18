package com.tnsif.shoppingmall.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tnsif.shoppingmall.entity.ShopOwner;

public interface IShopOwnerRepository extends JpaRepository<ShopOwner, Integer> {

}
