package com.alexandrupavel.smartloanappapi.model.company;

import com.alexandrupavel.smartloanappapi.model.geo.Country;
import jakarta.persistence.*;

@Entity
@Table(name = "companies")
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long companyId;

    @Column(nullable = false)
    private String companyName;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "legalPrefixId", nullable = false)
    private CompanyLegalPrefix legalPrefix;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "legalTypeId", nullable = false)
    private CompanyLegalType legalType;

    @Column(nullable = false, unique = true)
    private String registrationCode;  // CUI

    private String dunsCode;  // optional, can be null

    private String fiscalAddress;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "countryId", nullable = false)
    private Country country;

    private boolean isActive;

    public Company() {
    }

    public Company(Long companyId,
                   String companyName,
                   CompanyLegalPrefix legalPrefix,
                   CompanyLegalType legalType,
                   String registrationCode,
                   String dunsCode,
                   String fiscalAddress,
                   Country country,
                   boolean isActive) {
        this.companyId = companyId;
        this.companyName = companyName;
        this.legalPrefix = legalPrefix;
        this.legalType = legalType;
        this.registrationCode = registrationCode;
        this.dunsCode = dunsCode;
        this.fiscalAddress = fiscalAddress;
        this.country = country;
        this.isActive = isActive;
    }

    // ------------------- Getters & Setters -------------------

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public CompanyLegalPrefix getLegalPrefix() {
        return legalPrefix;
    }

    public void setLegalPrefix(CompanyLegalPrefix legalPrefix) {
        this.legalPrefix = legalPrefix;
    }

    public CompanyLegalType getLegalType() {
        return legalType;
    }

    public void setLegalType(CompanyLegalType legalType) {
        this.legalType = legalType;
    }

    public String getRegistrationCode() {
        return registrationCode;
    }

    public void setRegistrationCode(String registrationCode) {
        this.registrationCode = registrationCode;
    }

    public String getDunsCode() {
        return dunsCode;
    }

    public void setDunsCode(String dunsCode) {
        this.dunsCode = dunsCode;
    }

    public String getFiscalAddress() {
        return fiscalAddress;
    }

    public void setFiscalAddress(String fiscalAddress) {
        this.fiscalAddress = fiscalAddress;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
}
