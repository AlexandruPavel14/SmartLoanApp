package com.alexandrupavel.smartloanappapi.util.security;

import com.alexandrupavel.smartloanappapi.dto.security.RoleDTO;
import com.alexandrupavel.smartloanappapi.model.security.Role;

public class RoleMapper {

    public static RoleDTO toDTO(Role role) {
        RoleDTO dto = new RoleDTO();
        dto.setRoleId(role.getRoleId());
        dto.setRoleName(role.getRoleName());
        return dto;
    }

    public static Role toEntity(RoleDTO dto) {
        return new Role(dto.getRoleId(), dto.getRoleName());
    }
}
