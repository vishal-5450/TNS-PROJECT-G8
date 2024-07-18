package com.tnsif.shoppingmall.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tnsif.shoppingmall.entity.Mall;
import com.tnsif.shoppingmall.repository.IMallRepository;


@Service
public class IMallService {

	@Autowired
	IMallRepository iMallRepository;
	
	public void addMall(Mall mall) {
		iMallRepository.save(mall);
	}
	
	public Mall searchMall(int id) {
		return iMallRepository.findById(id).get();
	}
	
	public void updateMall(Mall mall,int id) {
		Mall mallId=searchMall(id);
		mallId.setCategories(mall.getCategories());
//		mallId.setShops_id(mall.get());
		mallId.setLocation(mall.getLocation());
		mallId.setMallName(mall.getMallName());
		mallId.setMallAdmin(mall.getMallAdmin());
		iMallRepository.save(mallId);
	}
	
	
}
