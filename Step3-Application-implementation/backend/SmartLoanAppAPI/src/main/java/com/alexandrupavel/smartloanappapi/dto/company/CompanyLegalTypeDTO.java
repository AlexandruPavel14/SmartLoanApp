package com.alexandrupavel.smartloanappapi.dto.company;

public class CompanyLegalTypeDTO {
    private Long legalTypeId;
    private String typeLabel;

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
