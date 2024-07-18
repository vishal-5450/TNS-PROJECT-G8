package com.tnsif.shoppingmall.entity;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;


@Entity
public class OrderDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private LocalDateTime dateOfPurchase;
	private float total;
	
	@ManyToOne
    @JoinColumn(name = "customer_id",nullable = false)
	@JsonBackReference
    private Customer customer;		// mapped to Customer Model.
	private String paymentMode;

//	@ManyToOne
//	@JoinColumn(name = "shop_id")
//	private Shop shop;
//	
//	public Shop getShop() {
//		return shop;
//	}
//	public void setShop(Shop shop) {
//		this.shop = shop;
//	}
	
	public OrderDetails() {
    }

    public OrderDetails(LocalDateTime dateOfPurchase, float total, Customer customer) {
        this.dateOfPurchase = dateOfPurchase;
        this.total = total;
        this.customer = customer;
    }
	
	public Customer getCustomer() {		// customer_id
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public LocalDateTime getDateOfPurchase() {
		return dateOfPurchase;
	}
	public void setDateOfPurchase(LocalDateTime dateOfPurchase) {
		this.dateOfPurchase = dateOfPurchase;
	}
	public float getTotal() {
		return total;
	}
	public void setTotal(float total) {
		this.total = total;
	}
	
	public String getPaymentMode() {
		return paymentMode;
	}
	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}

	
}
