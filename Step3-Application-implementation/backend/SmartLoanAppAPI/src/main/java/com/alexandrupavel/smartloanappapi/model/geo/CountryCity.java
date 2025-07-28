package com.alexandrupavel.smartloanappapi.model.geo;

import jakarta.persistence.*;

@Entity
@Table(name = "country_city")
public class CountryCity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long countryCityId;

    private Long countryId;
    private Long countyId;
    private Long cityId;

    public CountryCity() {}

    public CountryCity(Long countryCityId, Long countryId, Long countyId, Long cityId) {
        this.countryCityId = countryCityId;
        this.countryId = countryId;
        this.countyId = countyId;
        this.cityId = cityId;
    }

    public Long getCountryCityId() {
        return countryCityId;
    }

    public void setCountryCityId(Long countryCityId) {
        this.countryCityId = countryCityId;
    }

    public Long getCountryId() {
        return countryId;
    }

    public void setCountryId(Long countryId) {
        this.countryId = countryId;
    }

    public Long getCountyId() {
        return countyId;
    }

    public void setCountyId(Long countyId) {
        this.countyId = countyId;
    }

    public Long getCityId() {
        return cityId;
    }

    public void setCityId(Long cityId) {
        this.cityId = cityId;
    }
}
