package com.alexandrupavel.smartloanappapi.dto.file;

public class SpecificBasePathDTO {
    private Long id;
    private String basePath;
    private String description;

    // Getters & Setters
    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public String getBasePath() { return basePath; }

    public void setBasePath(String basePath) { this.basePath = basePath; }

    public String getDescription() { return description; }

    public void setDescription(String description) { this.description = description; }
}
