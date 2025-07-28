package com.alexandrupavel.smartloanappapi.model.file;

import jakarta.persistence.*;

@Entity
@Table(name = "file_extensions")
public class FileExtension {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String extension;
    private String mimeType;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "resource_type_id")
    private ResourceType resourceType;

    public FileExtension() {}

    public FileExtension(Long id, String extension, String mimeType, ResourceType resourceType) {
        this.id = id;
        this.extension = extension;
        this.mimeType = mimeType;
        this.resourceType = resourceType;
    }

    // Getters & Setters
    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public String getExtension() { return extension; }

    public void setExtension(String extension) { this.extension = extension; }

    public String getMimeType() { return mimeType; }

    public void setMimeType(String mimeType) { this.mimeType = mimeType; }

    public ResourceType getResourceType() { return resourceType; }

    public void setResourceType(ResourceType resourceType) { this.resourceType = resourceType; }
}
