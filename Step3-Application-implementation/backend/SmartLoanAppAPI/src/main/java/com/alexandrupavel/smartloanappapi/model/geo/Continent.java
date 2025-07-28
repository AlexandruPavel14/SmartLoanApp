package com.alexandrupavel.smartloanappapi.model.geo;

import jakarta.persistence.*;

@Entity
@Table(name = "continents")
public class Continent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long continentId;

    private String continentName;

    public Continent() {}

    public Continent(Long continentId, String continentName) {
        this.continentId = continentId;
        this.continentName = continentName;
    }

    // Getters & setters
    public Long getContinentId() {
        return continentId;
    }

    public void setContinentId(Long continentId) {
        this.continentId = continentId;
    }

    public String getContinentName() {
        return continentName;
    }

    public void setContinentName(String continentName) {
        this.continentName = continentName;
    }
}
