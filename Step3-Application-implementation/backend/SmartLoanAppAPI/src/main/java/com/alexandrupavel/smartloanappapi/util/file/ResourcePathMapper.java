package com.alexandrupavel.smartloanappapi.util.file;

import com.alexandrupavel.smartloanappapi.dto.file.ResourcePathDTO;
import com.alexandrupavel.smartloanappapi.model.file.*;

public class ResourcePathMapper {

    public static ResourcePathDTO toDTO(ResourcePath entity) {
        ResourcePathDTO dto = new ResourcePathDTO();
        dto.setId(entity.getId());
        dto.setCommonBasePathId(entity.getCommonBasePath().getId());
        dto.setSpecificBasePathId(entity.getSpecificBasePath().getId());
        dto.setFullPath(entity.getFullPath());
        dto.setFileName(entity.getFileName());
        dto.setResourceOwnerId(entity.getResourceOwnerId());
        dto.setResourceTypeId(entity.getResourceType().getId());
        dto.setFileExtensionId(entity.getFileExtension().getId());
        dto.setCreatedAt(entity.getCreatedAt());
        return dto;
    }

    public static ResourcePath toEntity(ResourcePathDTO dto,
                                        CommonBasePath cbp,
                                        SpecificBasePath sbp,
                                        ResourceType rt,
                                        FileExtension fe) {
        return new ResourcePath(
                dto.getId(),
                cbp,
                sbp,
                dto.getFullPath(),
                dto.getFileName(),
                dto.getResourceOwnerId(),
                rt,
                fe,
                dto.getCreatedAt()
        );
    }
}
