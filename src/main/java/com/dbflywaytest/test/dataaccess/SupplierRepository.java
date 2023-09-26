package com.dbflywaytest.test.dataaccess;

import com.dbflywaytest.test.models.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SupplierRepository extends JpaRepository<Supplier, Short> {
}