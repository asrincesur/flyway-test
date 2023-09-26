package com.dbflywaytest.test.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "us_states")

public class UsState {
    @Id
    @Column(name = "state_id", nullable = false)
    private Short id;

    @Column(name = "state_name", length = 100)
    private String stateName;

    @Column(name = "state_abbr", length = 2)
    private String stateAbbr;

    @Column(name = "state_region", length = 50)
    private String stateRegion;

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public String getStateAbbr() {
        return stateAbbr;
    }

    public void setStateAbbr(String stateAbbr) {
        this.stateAbbr = stateAbbr;
    }

    public String getStateRegion() {
        return stateRegion;
    }

    public void setStateRegion(String stateRegion) {
        this.stateRegion = stateRegion;
    }

}