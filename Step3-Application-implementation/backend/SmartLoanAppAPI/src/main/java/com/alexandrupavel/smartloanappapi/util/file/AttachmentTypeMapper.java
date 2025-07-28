package com.alexandrupavel.smartloanappapi.util.file;

import com.alexandrupavel.smartloanappapi.dto.file.AttachmentTypeDTO;
import com.alexandrupavel.smartloanappapi.model.file.AttachmentType;

public class AttachmentTypeMapper {

    public static AttachmentTypeDTO toDTO(AttachmentType entity) {
        AttachmentTypeDTO dto = new AttachmentTypeDTO();
        dto.setId(entity.getId());
        dto.setName(entity.getName());
        dto.setDescription(entity.getDescription());
        return dto;
    }

    public static AttachmentType toEntity(AttachmentTypeDTO dto) {
        return new AttachmentType(
                dto.getId(),
                dto.getName(),
                dto.getDescription()
        );
    }
}
