package com.alexandrupavel.smartloanappapi.dto.geo;

public class ContinentDTO {
    private Long continentId;
    private String continentName;

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
