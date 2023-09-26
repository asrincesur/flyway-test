package com.dbflywaytest.test.dataaccess;

import com.dbflywaytest.test.models.EmployeeTerritory;
import com.dbflywaytest.test.models.EmployeeTerritoryId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeTerritoryRepository extends JpaRepository<EmployeeTerritory, EmployeeTerritoryId> {
}