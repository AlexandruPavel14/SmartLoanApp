package com.alexandrupavel.smartloanappapi.dto.geo;

public class CountryCityDTO {
    private Long countryCityId;
    private Long countryId;
    private Long countyId;
    private Long cityId;

    // Getters & setters
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
