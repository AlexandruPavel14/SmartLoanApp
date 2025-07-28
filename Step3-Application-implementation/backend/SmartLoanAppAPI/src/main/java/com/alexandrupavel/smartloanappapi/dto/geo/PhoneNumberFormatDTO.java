package com.alexandrupavel.smartloanappapi.dto.geo;

public class PhoneNumberFormatDTO {
    private Long phoneNumberFormatId;
    private String countryCode;

    // Getters & setters
    public Long getPhoneNumberFormatId() {
        return phoneNumberFormatId;
    }

    public void setPhoneNumberFormatId(Long phoneNumberFormatId) {
        this.phoneNumberFormatId = phoneNumberFormatId;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }
}
