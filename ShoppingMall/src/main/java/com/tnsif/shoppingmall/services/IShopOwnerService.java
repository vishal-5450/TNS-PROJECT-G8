package com.tnsif.shoppingmall.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tnsif.shoppingmall.entity.ShopOwner;
import com.tnsif.shoppingmall.repository.IShopOwnerRepository;


@Service
@Transactional
public class IShopOwnerService {
	 @Autowired
	    private IShopOwnerRepository shopOwnerRepository; // Assuming you have a ShopOwnerRepository for data access

	    public List<ShopOwner> listAllShopOwners() {
	        return shopOwnerRepository.findAll();
	    }

	    public ShopOwner addShopOwner(ShopOwner shopOwner) {
	        return shopOwnerRepository.save(shopOwner);
	    }

	    public ShopOwner updateShopOwner(ShopOwner shopOwner) {
	        return shopOwnerRepository.save(shopOwner);
	    }

	    public ShopOwner searchShopOwner(Integer id) {
	        Optional<ShopOwner> optionalShopOwner = shopOwnerRepository.findById(id);
	        return optionalShopOwner.orElse(null);
	    }

	    public boolean deleteShopOwner(Integer id) {
	        if (shopOwnerRepository.existsById(id)) {
	        	shopOwnerRepository.deleteById(id);
	            return true;
	        }
	        return false;
	    }
}
