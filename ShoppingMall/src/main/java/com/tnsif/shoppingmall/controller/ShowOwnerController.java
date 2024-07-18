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

import com.tnsif.shoppingmall.entity.ShopOwner;
import com.tnsif.shoppingmall.repository.IItemRepository;
import com.tnsif.shoppingmall.repository.IShopOwnerRepository;
import com.tnsif.shoppingmall.services.IShopOwnerService;
import com.tnsif.shoppingmall.services.ItemService;

@RestController
@RequestMapping("/shop-owner")

public class ShowOwnerController {
	@Autowired
	IShopOwnerService services;
	
	@Autowired
	IShopOwnerRepository itemRepository ;

    // Endpoint to add a new shop owner
    @PostMapping("/add")
    public ResponseEntity<ShopOwner> addShopOwner(@RequestBody ShopOwner shopOwner) {
        ShopOwner addedShopOwner = services.addShopOwner(shopOwner);
        return ResponseEntity.ok().body(addedShopOwner);
    }

    // Endpoint to update an existing shop owner
    @PutMapping("/update")
    public ResponseEntity<ShopOwner> updateShopOwner(@RequestBody ShopOwner shopOwner) {
        ShopOwner updatedShopOwner = services.updateShopOwner(shopOwner);
        return ResponseEntity.ok().body(updatedShopOwner);
    }

    // Endpoint to search for a shop owner by their ID
    @GetMapping("/{id}")
    public ResponseEntity<ShopOwner> searchShopOwner(@PathVariable Integer id) {
        ShopOwner shopOwner = services.searchShopOwner(id);
        if (shopOwner != null) {
            return ResponseEntity.ok().body(shopOwner);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // Endpoint to delete a shop owner by their ID
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteShopOwner(@PathVariable Integer id) {
        boolean deletedShopOwner = services.deleteShopOwner(id);
        if (deletedShopOwner == true) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
