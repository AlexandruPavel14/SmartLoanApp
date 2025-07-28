package com.alexandrupavel.smartloanappapi.model.geo;

import jakarta.persistence.*;

@Entity
@Table(name = "counties")
public class County {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long countyId;

    private String countyName;

    public County() {}

    public County(Long countyId, String countyName) {
        this.countyId = countyId;
        this.countyName = countyName;
    }

    public Long getCountyId() {
        return countyId;
    }

    public void setCountyId(Long countyId) {
        this.countyId = countyId;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }
}
