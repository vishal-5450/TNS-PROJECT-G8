package com.tnsif.shoppingmall.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="item")
public class Item {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
	@Column
    private String name;
	@Column
    private LocalDate manufacturing;
	@Column
    private LocalDate expiry;
	@Column
    private float price;
	@Column
	private String category ;
	
	
	
	public Item() {
		super();
	}
	public Item(String name, LocalDate manufacturing, LocalDate expiry, float price, String category) {
		super();
		this.name = name;
		this.manufacturing = manufacturing;
		this.expiry = expiry;
		this.price = price;
		this.category = category;
	}
	public Item(int id, String name, LocalDate manufacturing, LocalDate expiry, float price, String category) {
		super();
		this.id = id;
		this.name = name;
		this.manufacturing = manufacturing;
		this.expiry = expiry;
		this.price = price;
		this.category = category;
	}
	
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getManufacturing() {
		return manufacturing;
	}
	public void setManufacturing(LocalDate manufacturing) {
		this.manufacturing = manufacturing;
	}
	public LocalDate getExpiry() {
		return expiry;
	}
	public void setExpiry(LocalDate expiry) {
		this.expiry = expiry;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", manufacturing=" + manufacturing + ", expiry=" + expiry
				+ ", price=" + price + ", category=" + category + "]";
	}
	
	
	
	
	
}