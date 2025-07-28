package com.alexandrupavel.smartloanappapi.util.security;

import com.alexandrupavel.smartloanappapi.dto.security.EntitlementDTO;
import com.alexandrupavel.smartloanappapi.model.security.Entitlement;

public class EntitlementMapper {

    public static EntitlementDTO toDTO(Entitlement entity) {
        EntitlementDTO dto = new EntitlementDTO();
        dto.setId(entity.getId());
        dto.setActionName(entity.getActionName());
        return dto;
    }

    public static Entitlement toEntity(EntitlementDTO dto) {
        return new Entitlement(dto.getId(), dto.getActionName());
    }
}
