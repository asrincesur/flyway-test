package com.dbflywaytest.test.models;

import jakarta.persistence.*;

@Entity
@Table(name = "territories")

public class Territory {
    @Id
    @Column(name = "territory_id", nullable = false, length = 20)
    private String territoryId;

    @Lob
    @Column(name = "territory_description", nullable = false)
    private String territoryDescription;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "region_id", nullable = false)
    private Region region;

    public String getTerritoryId() {
        return territoryId;
    }

    public void setTerritoryId(String territoryId) {
        this.territoryId = territoryId;
    }

    public String getTerritoryDescription() {
        return territoryDescription;
    }

    public void setTerritoryDescription(String territoryDescription) {
        this.territoryDescription = territoryDescription;
    }

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }

}