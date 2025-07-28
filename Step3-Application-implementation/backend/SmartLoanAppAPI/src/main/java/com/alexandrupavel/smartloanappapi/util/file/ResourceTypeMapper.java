package com.alexandrupavel.smartloanappapi.util.file;

import com.alexandrupavel.smartloanappapi.dto.file.ResourceTypeDTO;
import com.alexandrupavel.smartloanappapi.model.file.ResourceType;

public class ResourceTypeMapper {

    public static ResourceTypeDTO toDTO(ResourceType entity) {
        ResourceTypeDTO dto = new ResourceTypeDTO();
        dto.setId(entity.getId());
        dto.setTypeLabel(entity.getTypeLabel());
        dto.setDescription(entity.getDescription());
        return dto;
    }

    public static ResourceType toEntity(ResourceTypeDTO dto) {
        return new ResourceType(
                dto.getId(),
                dto.getTypeLabel(),
                dto.getDescription()
        );
    }
}
