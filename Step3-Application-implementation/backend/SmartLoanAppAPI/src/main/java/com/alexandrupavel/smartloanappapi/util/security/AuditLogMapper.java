package com.alexandrupavel.smartloanappapi.util.security;

import com.alexandrupavel.smartloanappapi.dto.security.AuditLogDTO;
import com.alexandrupavel.smartloanappapi.model.security.AuditLog;

public class AuditLogMapper {

    public static AuditLogDTO toDTO(AuditLog entity) {
        AuditLogDTO dto = new AuditLogDTO();
        dto.setId(entity.getId());
        dto.setActionType(entity.getActionType());
        dto.setEntityName(entity.getEntityName());
        dto.setPerformedBy(entity.getPerformedBy());
        dto.setTimestamp(entity.getTimestamp());
        dto.setDetails(entity.getDetails());
        return dto;
    }

    public static AuditLog toEntity(AuditLogDTO dto) {
        return new AuditLog(
                dto.getId(),
                dto.getActionType(),
                dto.getEntityName(),
                dto.getPerformedBy(),
                dto.getTimestamp(),
                dto.getDetails()
        );
    }
}
