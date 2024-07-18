package com.tnsif.shoppingmall.entity;
import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String name;

    @Column
    private LocalDate dob;

    @Column
    private float salary;

    @Column
    private String address;

    @Column
    private String designation;

    @ManyToOne
    @JoinColumn(name = "shop_id")
    private Shop shop;

    // Constructors, getters, setters, and toString method

    public Employee() {}

    public Employee(String name, LocalDate dob, float salary, String address, String designation, Shop shop) {
        this.name = name;
        this.dob = dob;
        this.salary = salary;
        this.address = address;
        this.designation = designation;
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

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public Shop getShop() {
        return shop;
    }

    public void setShop(Shop shop) {
        this.shop = shop;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", dob=" + dob + ", salary=" + salary + ", address=" + address + ", designation=" + designation + ", shop=" + shop + "]";
    }
}