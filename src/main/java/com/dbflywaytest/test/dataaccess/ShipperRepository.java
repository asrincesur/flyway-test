package com.dbflywaytest.test.dataaccess;

import com.dbflywaytest.test.models.Shipper;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShipperRepository extends JpaRepository<Shipper, Short> {
}