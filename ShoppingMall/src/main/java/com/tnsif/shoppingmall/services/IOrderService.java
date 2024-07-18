package com.tnsif.shoppingmall.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tnsif.shoppingmall.entity.OrderDetails;
import com.tnsif.shoppingmall.repository.IOrderRepository;

@Service
public class IOrderService {
	
	@Autowired
	IOrderRepository iOrderRepository;
	
	public void addOrder(OrderDetails order) {
		iOrderRepository.save(order);
	}
	
	public OrderDetails searchOrder(int id) {
		return iOrderRepository.findById(id).get();
	}
	
	public void deleteOrder(int id) {
		iOrderRepository.deleteById(id);
	}
	public void updateOrder(OrderDetails orderDetails,int id) {
		OrderDetails order=searchOrder(id);
		order.setCustomer(orderDetails.getCustomer());
		order.setDateOfPurchase(order.getDateOfPurchase());
		order.setPaymentMode(orderDetails.getPaymentMode());
//		order.setShop_id(orderDetails.getShop_id());
		order.setTotal(orderDetails.getTotal());
		iOrderRepository.save(order);
		
	}
	
}
