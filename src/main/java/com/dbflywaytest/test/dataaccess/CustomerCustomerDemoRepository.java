package com.dbflywaytest.test.dataaccess;

import com.dbflywaytest.test.models.CustomerCustomerDemo;
import com.dbflywaytest.test.models.CustomerCustomerDemoId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerCustomerDemoRepository extends JpaRepository<CustomerCustomerDemo, CustomerCustomerDemoId> {
}