package com.tnsif.shoppingmall.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tnsif.shoppingmall.entity.Shop;
import com.tnsif.shoppingmall.repository.IShopRepository;
import com.tnsif.shoppingmall.services.IShopService;

@RestController
@RequestMapping("/shop")
public class ShopController {
    
    @Autowired
    IShopService shopService;
	
	@Autowired
	IShopRepository shopRepository ;

   
    @PostMapping("/add")
    public ResponseEntity<Shop> addShop(@RequestBody Shop shop) {
        Shop addedShop = shopService.addShop(shop);
        return ResponseEntity.ok().body(addedShop);
    }

    @PutMapping("/update")
    public ResponseEntity<Shop> updateShop(@RequestBody Shop shop) {
        Shop updatedShop = shopService.updateShop(shop);
        return ResponseEntity.ok().body(updatedShop);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Shop> searchShopById(@PathVariable Integer id) {
        Shop shop = shopService.searchShopById(id);
        if (shop != null) {
            return ResponseEntity.ok().body(shop);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteShop(@PathVariable Integer id) {
        boolean deleted = shopService.deleteShop(id);
        if (deleted) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
