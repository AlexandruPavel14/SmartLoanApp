package com.alexandrupavel.smartloanappapi.model.geo;

import jakarta.persistence.*;

@Entity
@Table(name = "phone_number_formats")
public class PhoneNumberFormat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long phoneNumberFormatId;

    private String countryCode;

    public PhoneNumberFormat() {}

    public PhoneNumberFormat(Long phoneNumberFormatId, String countryCode) {
        this.phoneNumberFormatId = phoneNumberFormatId;
        this.countryCode = countryCode;
    }

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
