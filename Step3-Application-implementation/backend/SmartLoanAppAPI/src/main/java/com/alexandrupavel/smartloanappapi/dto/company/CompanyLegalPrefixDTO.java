package com.alexandrupavel.smartloanappapi.dto.company;

public class CompanyLegalPrefixDTO {
    private Long legalPrefixId;
    private String prefix;

    public Long getLegalPrefixId() {
        return legalPrefixId;
    }

    public void setLegalPrefixId(Long legalPrefixId) {
        this.legalPrefixId = legalPrefixId;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }
}
