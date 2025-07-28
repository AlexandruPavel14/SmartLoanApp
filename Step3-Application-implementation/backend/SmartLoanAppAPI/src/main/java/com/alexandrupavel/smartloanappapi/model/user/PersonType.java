package com.alexandrupavel.smartloanappapi.model.user;

import jakarta.persistence.*;

@Entity
@Table(name = "person_types")
public class PersonType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long personTypeId;

    private String typeLabel;

    public PersonType() {}

    public PersonType(Long personTypeId, String typeLabel) {
        this.personTypeId = personTypeId;
        this.typeLabel = typeLabel;
    }

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
