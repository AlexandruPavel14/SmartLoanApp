package com.alexandrupavel.smartloanappapi.dto.file;

public class FileExtensionDTO {

    private Long id;
    private String extension;
    private String mimeType;
    private Long resourceTypeId;

    // Getters & Setters
    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public String getExtension() { return extension; }

    public void setExtension(String extension) { this.extension = extension; }

    public String getMimeType() { return mimeType; }

    public void setMimeType(String mimeType) { this.mimeType = mimeType; }

    public Long getResourceTypeId() { return resourceTypeId; }

    public void setResourceTypeId(Long resourceTypeId) { this.resourceTypeId = resourceTypeId; }
}
