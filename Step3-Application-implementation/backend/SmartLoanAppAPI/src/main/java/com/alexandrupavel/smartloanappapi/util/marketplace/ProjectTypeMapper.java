package com.alexandrupavel.smartloanappapi.util.marketplace;

import com.alexandrupavel.smartloanappapi.dto.marketplace.ProjectTypeDTO;
import com.alexandrupavel.smartloanappapi.model.marketplace.ProjectType;

public class ProjectTypeMapper {

    public static ProjectTypeDTO toDTO(ProjectType entity) {
        ProjectTypeDTO dto = new ProjectTypeDTO();
        dto.setProjectTypeId(entity.getProjectTypeId());
        dto.setName(entity.getName());
        return dto;
    }

    public static ProjectType toEntity(ProjectTypeDTO dto) {
        return new ProjectType(dto.getProjectTypeId(), dto.getName());
    }
}
