package com.tnsif.shoppingmall.entity;
import jakarta.persistence.*;


@Entity
@Table(name = "Shop")
public class Shop {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "shopId")
    private int shopId;

    @Column
    private String shopCategory;

    @ManyToOne
    @JoinColumn(name = "shopEmployeeID")
    private Employee shopEmployee;

    @Column
    private String shopName;

    @Column
    private String customers;

    @Column
    private String shopStatus;

    @ManyToOne
    @JoinColumn(name = "shopOwner")
    private ShopOwner shopOwner;

    @Column
    private String leaseStatus;

    // Constructors, getters, setters, and toString method

    public Shop() {}

    public Shop(String shopCategory, Employee shopEmployee, String shopName, String customers, String shopStatus, ShopOwner shopOwner, String leaseStatus) {
        this.shopCategory = shopCategory;
        this.shopEmployee = shopEmployee;
        this.shopName = shopName;
        this.customers = customers;
        this.shopStatus = shopStatus;
        this.shopOwner = shopOwner;
        this.leaseStatus = leaseStatus;
    }

    public int getShopId() {
        return shopId;
    }

    public void setShopId(int shopId) {
        this.shopId = shopId;
    }

    public String getShopCategory() {
        return shopCategory;
    }

    public void setShopCategory(String shopCategory) {
        this.shopCategory = shopCategory;
    }

    public Employee getShopEmployee() {
        return shopEmployee;
    }

    public void setShopEmployee(Employee shopEmployee) {
        this.shopEmployee = shopEmployee;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getCustomers() {
        return customers;
    }

    public void setCustomers(String customers) {
        this.customers = customers;
    }

    public String getShopStatus() {
        return shopStatus;
    }

    public void setShopStatus(String shopStatus) {
        this.shopStatus = shopStatus;
    }

    public ShopOwner getShopOwner() {
        return shopOwner;
    }

    public void setShopOwner(ShopOwner shopOwner) {
        this.shopOwner = shopOwner;
    }

    public String getLeaseStatus() {
        return leaseStatus;
    }

    public void setLeaseStatus(String leaseStatus) {
        this.leaseStatus = leaseStatus;
    }

    @Override
    public String toString() {
        return "Shop [shopId=" + shopId + ", shopCategory=" + shopCategory + ", shopEmployee=" + shopEmployee + ", shopName=" + shopName + ", customers=" + customers + ", shopStatus=" + shopStatus + ", shopOwner=" + shopOwner + ", leaseStatus=" + leaseStatus + "]";
    }
}