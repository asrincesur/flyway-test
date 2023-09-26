package com.dbflywaytest.test.dataaccess;

import com.dbflywaytest.test.models.UsState;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsStateRepository extends JpaRepository<UsState, Short> {
}