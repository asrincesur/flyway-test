package com.dbflywaytest.test.dataaccess;

import com.dbflywaytest.test.models.CustomerDemographic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerDemographicRepository extends JpaRepository<CustomerDemographic, String> {
}