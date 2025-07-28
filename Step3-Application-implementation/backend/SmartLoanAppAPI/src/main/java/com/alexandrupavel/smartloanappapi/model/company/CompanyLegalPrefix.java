package com.alexandrupavel.smartloanappapi.model.company;

import jakarta.persistence.*;

@Entity
@Table(name = "company_legal_prefixes")
public class CompanyLegalPrefix {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long legalPrefixId;

    private String prefix;

    public CompanyLegalPrefix() {}

    public CompanyLegalPrefix(Long legalPrefixId, String prefix) {
        this.legalPrefixId = legalPrefixId;
        this.prefix = prefix;
    }

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
