package com.alexandrupavel.smartloanappapi.model.company;

import jakarta.persistence.*;

@Entity
@Table(name = "company_legal_types")
public class CompanyLegalType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long legalTypeId;

    private String typeLabel;

    public CompanyLegalType() {}

    public CompanyLegalType(Long legalTypeId, String typeLabel) {
        this.legalTypeId = legalTypeId;
        this.typeLabel = typeLabel;
    }

    public Long getLegalTypeId() {
        return legalTypeId;
    }

    public void setLegalTypeId(Long legalTypeId) {
        this.legalTypeId = legalTypeId;
    }

    public String getTypeLabel() {
        return typeLabel;
    }

    public void setTypeLabel(String typeLabel) {
        this.typeLabel = typeLabel;
    }
}
