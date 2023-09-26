package com.dbflywaytest.test.dataaccess;

import com.dbflywaytest.test.models.Region;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegionRepository extends JpaRepository<Region, Short> {
}