package com.dbflywaytest.test.models;

import jakarta.persistence.*;

@Entity
@Table(name = "customer_demographics")
public class CustomerDemographic {
    @Id
    @Lob
    @Column(name = "customer_type_id", nullable = false)
    private String customerTypeId;

    @Column(name = "customer_desc", length = Integer.MAX_VALUE)
    private String customerDesc;

    public String getCustomerTypeId() {
        return customerTypeId;
    }

    public void setCustomerTypeId(String customerTypeId) {
        this.customerTypeId = customerTypeId;
    }

    public String getCustomerDesc() {
        return customerDesc;
    }

    public void setCustomerDesc(String customerDesc) {
        this.customerDesc = customerDesc;
    }

}