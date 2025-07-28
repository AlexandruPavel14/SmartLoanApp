package com.alexandrupavel.smartloanappapi.dto.user;

public class PersonTypeDTO {
    private Long personTypeId;
    private String typeLabel;

    // Getters & setters
    public Long getPersonTypeId() {
        return personTypeId;
    }

    public void setPersonTypeId(Long personTypeId) {
        this.personTypeId = personTypeId;
    }

    public String getTypeLabel() {
        return typeLabel;
    }

    public void setTypeLabel(String typeLabel) {
        this.typeLabel = typeLabel;
    }
}
