package com.alexandrupavel.smartloanappapi.model.file;

import jakarta.persistence.*;

@Entity
@Table(name = "common_base_paths")
public class CommonBasePath {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String basePath;
    private String description;

    public CommonBasePath() {}

    public CommonBasePath(Long id, String basePath, String description) {
        this.id = id;
        this.basePath = basePath;
        this.description = description;
    }

    // Getters & Setters
    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public String getBasePath() { return basePath; }

    public void setBasePath(String basePath) { this.basePath = basePath; }

    public String getDescription() { return description; }

    public void setDescription(String description) { this.description = description; }
}
