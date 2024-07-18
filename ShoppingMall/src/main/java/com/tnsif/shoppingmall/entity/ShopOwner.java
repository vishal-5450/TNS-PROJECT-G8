package com.tnsif.shoppingmall.entity;
import jakarta.persistence.*;
import java.time.LocalDate;


@Entity
@Table(name = "shop_owner")
public class ShopOwner {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String name;

    @Column
    private LocalDate dob;

    @Column
    private String address;

    @ManyToOne
    @JoinColumn(name = "shop_id")
    private Shop shop;

    // Constructors, getters, setters, and toString method

    public ShopOwner() {
    	super();
    }

    public ShopOwner(String name, LocalDate dob, String address, Shop shop) {
    	super();
        this.name = name;
        this.dob = dob;
        this.address = address;
        this.shop = shop;
    }

    
    
    public ShopOwner(int id, String name, LocalDate dob, String address, Shop shop) {
		super();
		this.id = id;
		this.name = name;
		this.dob = dob;
		this.address = address;
		this.shop = shop;
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

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Shop getShop() {
        return shop;
    }

    public void setShop(Shop shop) {
        this.shop = shop;
    }

    @Override
    public String toString() {
        return "ShopOwner [id=" + id + ", name=" + name + ", dob=" + dob + ", address=" + address + ", shop=" + shop + "]";
    }
}
