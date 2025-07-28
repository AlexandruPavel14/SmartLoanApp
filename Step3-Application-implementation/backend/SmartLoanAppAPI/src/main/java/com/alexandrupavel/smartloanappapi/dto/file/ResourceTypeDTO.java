package com.alexandrupavel.smartloanappapi.dto.file;

public class ResourceTypeDTO {

    private Long id;
    private String typeLabel;
    private String description;

    // Getters & Setters
    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public String getTypeLabel() { return typeLabel; }

    public void setTypeLabel(String typeLabel) { this.typeLabel = typeLabel; }

    public String getDescription() { return description; }

    public void setDescription(String description) { this.description = description; }
}
