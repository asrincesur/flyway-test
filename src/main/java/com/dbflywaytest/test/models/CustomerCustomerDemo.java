package com.dbflywaytest.test.models;

import jakarta.persistence.*;

@Entity
@Table(name = "customer_customer_demo")
public class CustomerCustomerDemo {
    @EmbeddedId
    private CustomerCustomerDemoId id;

    @MapsId("customerId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "customer_id", nullable = false)
    private Customer customer;

    @MapsId("customerTypeId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "customer_type_id", nullable = false)
    private CustomerDemographic customerType;

    public CustomerCustomerDemoId getId() {
        return id;
    }

    public void setId(CustomerCustomerDemoId id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public CustomerDemographic getCustomerType() {
        return customerType;
    }

    public void setCustomerType(CustomerDemographic customerType) {
        this.customerType = customerType;
    }

}