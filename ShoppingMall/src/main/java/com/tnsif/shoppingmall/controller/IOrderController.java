package com.tnsif.shoppingmall.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tnsif.shoppingmall.entity.OrderDetails;
import com.tnsif.shoppingmall.services.IOrderService;


@RestController
public class IOrderController {

	@Autowired
	IOrderService iOrderService;
	
	@PostMapping("/addOrder")
	public void addOrder(@RequestBody OrderDetails orderDetails) {
		iOrderService.addOrder(orderDetails);
	}
	
	@PutMapping("updateOrder")
	public void updateOrder(@RequestBody OrderDetails orderDetails,@RequestParam(name="id")int id) {
		iOrderService.updateOrder(orderDetails, id);
	}
	
	@GetMapping("searchOrder/{id}")
	public OrderDetails searchOrder(@PathVariable (name="id")int id) {
		return iOrderService.searchOrder(id);
	}

	@DeleteMapping("deleteOrder/{id}")
	public void deleteOrder(@PathVariable (name="id")int id) {
		iOrderService.deleteOrder(id);
	}
	
	
	
}
