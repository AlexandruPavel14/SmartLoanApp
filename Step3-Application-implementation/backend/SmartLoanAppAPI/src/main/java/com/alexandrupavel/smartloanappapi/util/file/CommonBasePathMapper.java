package com.alexandrupavel.smartloanappapi.util.file;

import com.alexandrupavel.smartloanappapi.dto.file.CommonBasePathDTO;
import com.alexandrupavel.smartloanappapi.model.file.CommonBasePath;

public class CommonBasePathMapper {

    public static CommonBasePathDTO toDTO(CommonBasePath entity) {
        CommonBasePathDTO dto = new CommonBasePathDTO();
        dto.setId(entity.getId());
        dto.setBasePath(entity.getBasePath());
        dto.setDescription(entity.getDescription());
        return dto;
    }

    public static CommonBasePath toEntity(CommonBasePathDTO dto) {
        return new CommonBasePath(
                dto.getId(),
                dto.getBasePath(),
                dto.getDescription()
        );
    }
}
