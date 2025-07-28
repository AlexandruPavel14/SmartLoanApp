package com.alexandrupavel.smartloanappapi.dto.company;

public class CompanyDTO {
    private Long companyId;
    private String companyName;
    private Long legalPrefixId;
    private Long legalTypeId;
    private String registrationCode;
    private String dunsCode;
    private String fiscalAddress;
    private Long countryId;
    private boolean isActive;

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

    public Long getLegalPrefixId() {
        return legalPrefixId;
    }

    public void setLegalPrefixId(Long legalPrefixId) {
        this.legalPrefixId = legalPrefixId;
    }

    public Long getLegalTypeId() {
        return legalTypeId;
    }

    public void setLegalTypeId(Long legalTypeId) {
        this.legalTypeId = legalTypeId;
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

    public Long getCountryId() {
        return countryId;
    }

    public void setCountryId(Long countryId) {
        this.countryId = countryId;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setIsActive(boolean active) {
        this.isActive = active;
    }
}
