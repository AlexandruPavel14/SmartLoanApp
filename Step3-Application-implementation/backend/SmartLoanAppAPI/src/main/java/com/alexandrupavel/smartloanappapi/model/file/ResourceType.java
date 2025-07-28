package com.alexandrupavel.smartloanappapi.model.file;

import jakarta.persistence.*;

@Entity
@Table(name = "resource_types")
public class ResourceType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String typeLabel;
    private String description;

    public ResourceType() {}

    public ResourceType(Long id, String typeLabel, String description) {
        this.id = id;
        this.typeLabel = typeLabel;
        this.description = description;
    }

    // Getters & Setters
    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public String getTypeLabel() { return typeLabel; }

    public void setTypeLabel(String typeLabel) { this.typeLabel = typeLabel; }

    public String getDescription() { return description; }

    public void setDescription(String description) { this.description = description; }
}
