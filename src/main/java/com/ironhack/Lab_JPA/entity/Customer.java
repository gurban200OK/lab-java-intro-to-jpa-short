package com.ironhack.Lab_JPA.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "customers")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer customerId;

    @Column(nullable = false,name = "customer_name")
    private String customerName;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false,name = "customer_status")
    private CustomerStatus customerStatus;

    @Column(nullable = false,name = "total_customer_mileage")
    private Integer totalCustomerMileage;

    public Customer(){}

    public Customer(String customerName, CustomerStatus status, Integer totalCustomerMileage) {
        this.customerName = customerName;
        this.customerStatus = status;
        this.totalCustomerMileage = totalCustomerMileage;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public CustomerStatus getStatus() {
        return customerStatus;
    }

    public void setStatus(CustomerStatus status) {
        this.customerStatus = status;
    }

    public Integer getTotalCustomerMileage() {
        return totalCustomerMileage;
    }

    public void setTotalCustomerMileage(Integer totalCustomerMileage) {
        this.totalCustomerMileage = totalCustomerMileage;
    }
}
