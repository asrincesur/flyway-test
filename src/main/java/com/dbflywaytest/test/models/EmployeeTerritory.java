package com.dbflywaytest.test.models;

import jakarta.persistence.*;

@Entity
@Table(name = "employee_territories")

public class EmployeeTerritory {
    @EmbeddedId
    private EmployeeTerritoryId id;

    @MapsId("employeeId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "employee_id", nullable = false)
    private Employee employee;

    @MapsId("territoryId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "territory_id", nullable = false)
    private Territory territory;

    public EmployeeTerritoryId getId() {
        return id;
    }

    public void setId(EmployeeTerritoryId id) {
        this.id = id;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Territory getTerritory() {
        return territory;
    }

    public void setTerritory(Territory territory) {
        this.territory = territory;
    }

}