package com.dbflywaytest.test.dataaccess;

import com.dbflywaytest.test.models.OrderDetail;
import com.dbflywaytest.test.models.OrderDetailId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderDetailRepository extends JpaRepository<OrderDetail, OrderDetailId> {
}