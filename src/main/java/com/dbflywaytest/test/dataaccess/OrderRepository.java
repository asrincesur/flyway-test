package com.dbflywaytest.test.dataaccess;

import com.dbflywaytest.test.models.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Short> {
}