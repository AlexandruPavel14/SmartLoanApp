package com.alexandrupavel.smartloanappapi.util.file;

import com.alexandrupavel.smartloanappapi.dto.file.SpecificBasePathDTO;
import com.alexandrupavel.smartloanappapi.model.file.SpecificBasePath;

public class SpecificBasePathMapper {

    public static SpecificBasePathDTO toDTO(SpecificBasePath entity) {
        SpecificBasePathDTO dto = new SpecificBasePathDTO();
        dto.setId(entity.getId());
        dto.setBasePath(entity.getBasePath());
        dto.setDescription(entity.getDescription());
        return dto;
    }

    public static SpecificBasePath toEntity(SpecificBasePathDTO dto) {
        return new SpecificBasePath(
                dto.getId(),
                dto.getBasePath(),
                dto.getDescription()
        );
    }
}
