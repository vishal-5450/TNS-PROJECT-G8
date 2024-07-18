package com.tnsif.shoppingmall.services;

import org.hibernate.sql.Update;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tnsif.shoppingmall.entity.MallAdmin;
import com.tnsif.shoppingmall.repository.IMallAdminRepository;


@Service
public class IMallAdminService {
	
	@Autowired
	IMallAdminRepository iMallAdminRepository;
	
	public void addMallAdmin(MallAdmin mallAdmin) {
		iMallAdminRepository.save(mallAdmin);
	}
	
	public MallAdmin searchMallAdmin(int id) {
		return iMallAdminRepository.findById(id).get();
	}
	
	public void updateMallAdmin(MallAdmin mallAdmin,int id) {
		MallAdmin mallAdminId=searchMallAdmin(id);
		mallAdminId.setPhone(mallAdmin.getPhone());
		mallAdminId.setMall(mallAdmin.getMall());
		mallAdminId.setPassword(mallAdmin.getPassword());
		mallAdminId.setName(mallAdmin.getName());
		iMallAdminRepository.save(mallAdminId);
	}
	
	public void deleteMallAdmin(int id) {
		iMallAdminRepository.deleteById(id);
	}
}
