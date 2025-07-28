package com.alexandrupavel.smartloanappapi.util.file;

import com.alexandrupavel.smartloanappapi.dto.file.FileExtensionDTO;
import com.alexandrupavel.smartloanappapi.model.file.FileExtension;
import com.alexandrupavel.smartloanappapi.model.file.ResourceType;

public class FileExtensionMapper {

    public static FileExtensionDTO toDTO(FileExtension entity) {
        FileExtensionDTO dto = new FileExtensionDTO();
        dto.setId(entity.getId());
        dto.setExtension(entity.getExtension());
        dto.setMimeType(entity.getMimeType());
        dto.setResourceTypeId(entity.getResourceType() != null ? entity.getResourceType().getId() : null);
        return dto;
    }

    public static FileExtension toEntity(FileExtensionDTO dto, ResourceType resourceType) {
        return new FileExtension(
                dto.getId(),
                dto.getExtension(),
                dto.getMimeType(),
                resourceType
        );
    }
}
