package com.dbflywaytest.test.models;

import jakarta.persistence.*;

@Entity
@Table(name = "region")

public class Region {
    @Id
    @Column(name = "region_id", nullable = false)
    private Short id;

    @Lob
    @Column(name = "region_description", nullable = false)
    private String regionDescription;

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public String getRegionDescription() {
        return regionDescription;
    }

    public void setRegionDescription(String regionDescription) {
        this.regionDescription = regionDescription;
    }

}