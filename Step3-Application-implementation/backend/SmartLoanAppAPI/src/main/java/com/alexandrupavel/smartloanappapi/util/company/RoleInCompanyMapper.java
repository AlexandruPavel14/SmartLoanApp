package com.alexandrupavel.smartloanappapi.util.company;

import com.alexandrupavel.smartloanappapi.dto.company.RoleInCompanyDTO;
import com.alexandrupavel.smartloanappapi.model.company.RoleInCompany;

public class RoleInCompanyMapper {

    public static RoleInCompanyDTO toDTO(RoleInCompany role) {
        RoleInCompanyDTO dto = new RoleInCompanyDTO();
        dto.setRoleInCompanyId(role.getRoleInCompanyId());
        dto.setRoleName(role.getRoleName());
        dto.setDescription(role.getDescription());
        return dto;
    }

    public static RoleInCompany toEntity(RoleInCompanyDTO dto) {
        return new RoleInCompany(
                dto.getRoleInCompanyId(),
                dto.getRoleName(),
                dto.getDescription()
        );
    }
}
