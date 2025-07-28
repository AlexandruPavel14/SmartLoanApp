package com.alexandrupavel.smartloanappapi.model.file;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "resource_paths")
public class ResourcePath {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "common_base_path_id")
    private CommonBasePath commonBasePath;

    @ManyToOne
    @JoinColumn(name = "specific_base_path_id")
    private SpecificBasePath specificBasePath;

    private String fullPath;
    private String fileName;
    private Long resourceOwnerId;

    @ManyToOne
    @JoinColumn(name = "resource_type_id")
    private ResourceType resourceType;

    @ManyToOne
    @JoinColumn(name = "file_extension_id")
    private FileExtension fileExtension;

    private LocalDateTime createdAt;

    public ResourcePath() {}

    public ResourcePath(Long id, CommonBasePath commonBasePath, SpecificBasePath specificBasePath,
                        String fullPath, String fileName, Long resourceOwnerId,
                        ResourceType resourceType, FileExtension fileExtension,
                        LocalDateTime createdAt) {
        this.id = id;
        this.commonBasePath = commonBasePath;
        this.specificBasePath = specificBasePath;
        this.fullPath = fullPath;
        this.fileName = fileName;
        this.resourceOwnerId = resourceOwnerId;
        this.resourceType = resourceType;
        this.fileExtension = fileExtension;
        this.createdAt = createdAt;
    }

    @PrePersist
    protected void onCreate() {
        this.createdAt = LocalDateTime.now();
    }

    // Getters & Setters
    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public CommonBasePath getCommonBasePath() { return commonBasePath; }

    public void setCommonBasePath(CommonBasePath commonBasePath) { this.commonBasePath = commonBasePath; }

    public SpecificBasePath getSpecificBasePath() { return specificBasePath; }

    public void setSpecificBasePath(SpecificBasePath specificBasePath) { this.specificBasePath = specificBasePath; }

    public String getFullPath() { return fullPath; }

    public void setFullPath(String fullPath) { this.fullPath = fullPath; }

    public String getFileName() { return fileName; }

    public void setFileName(String fileName) { this.fileName = fileName; }

    public Long getResourceOwnerId() { return resourceOwnerId; }

    public void setResourceOwnerId(Long resourceOwnerId) { this.resourceOwnerId = resourceOwnerId; }

    public ResourceType getResourceType() { return resourceType; }

    public void setResourceType(ResourceType resourceType) { this.resourceType = resourceType; }

    public FileExtension getFileExtension() { return fileExtension; }

    public void setFileExtension(FileExtension fileExtension) { this.fileExtension = fileExtension; }

    public LocalDateTime getCreatedAt() { return createdAt; }

    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }
}
