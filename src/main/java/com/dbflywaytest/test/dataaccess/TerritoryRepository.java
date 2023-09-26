package com.dbflywaytest.test.dataaccess;

import com.dbflywaytest.test.models.Territory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TerritoryRepository extends JpaRepository<Territory, String> {
}