package com.dbflywaytest.test.dataaccess;

import com.dbflywaytest.test.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Short> {
}