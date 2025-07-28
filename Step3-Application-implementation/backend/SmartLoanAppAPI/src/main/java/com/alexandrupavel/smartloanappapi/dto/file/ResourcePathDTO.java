package com.alexandrupavel.smartloanappapi.dto.file;

import java.time.LocalDateTime;

public class ResourcePathDTO {

    private Long id;
    private Long commonBasePathId;
    private Long specificBasePathId;
    private String fullPath;
    private String fileName;
    private Long resourceOwnerId;
    private Long resourceTypeId;
    private Long fileExtensionId;
    private LocalDateTime createdAt;

    // Getters & Setters
    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public Long getCommonBasePathId() { return commonBasePathId; }

    public void setCommonBasePathId(Long commonBasePathId) { this.commonBasePathId = commonBasePathId; }

    public Long getSpecificBasePathId() { return specificBasePathId; }

    public void setSpecificBasePathId(Long specificBasePathId) { this.specificBasePathId = specificBasePathId; }

    public String getFullPath() { return fullPath; }

    public void setFullPath(String fullPath) { this.fullPath = fullPath; }

    public String getFileName() { return fileName; }

    public void setFileName(String fileName) { this.fileName = fileName; }

    public Long getResourceOwnerId() { return resourceOwnerId; }

    public void setResourceOwnerId(Long resourceOwnerId) { this.resourceOwnerId = resourceOwnerId; }

    public Long getResourceTypeId() { return resourceTypeId; }

    public void setResourceTypeId(Long resourceTypeId) { this.resourceTypeId = resourceTypeId; }

    public Long getFileExtensionId() { return fileExtensionId; }

    public void setFileExtensionId(Long fileExtensionId) { this.fileExtensionId = fileExtensionId; }

    public LocalDateTime getCreatedAt() { return createdAt; }

    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }
}
