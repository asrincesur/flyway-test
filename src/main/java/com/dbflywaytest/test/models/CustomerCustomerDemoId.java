package com.dbflywaytest.test.models;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Lob;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class CustomerCustomerDemoId implements Serializable {
    private static final long serialVersionUID = 4996320260457747497L;
    @Lob
    @Column(name = "customer_id", nullable = false)
    private String customerId;

    @Lob
    @Column(name = "customer_type_id", nullable = false)
    private String customerTypeId;

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCustomerTypeId() {
        return customerTypeId;
    }

    public void setCustomerTypeId(String customerTypeId) {
        this.customerTypeId = customerTypeId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        CustomerCustomerDemoId entity = (CustomerCustomerDemoId) o;
        return Objects.equals(this.customerTypeId, entity.customerTypeId) &&
                Objects.equals(this.customerId, entity.customerId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerTypeId, customerId);
    }

}