package com.dbflywaytest.test.dataaccess;

import com.dbflywaytest.test.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Short> {
}