package com.alexandrupavel.smartloanappapi.util.user;

import com.alexandrupavel.smartloanappapi.dto.user.UserCompanyDTO;
import com.alexandrupavel.smartloanappapi.model.company.Company;
import com.alexandrupavel.smartloanappapi.model.company.RoleInCompany;
import com.alexandrupavel.smartloanappapi.model.user.User;
import com.alexandrupavel.smartloanappapi.model.user.UserCompany;

public class UserCompanyMapper {

    public static UserCompanyDTO toDTO(UserCompany entity) {
        UserCompanyDTO dto = new UserCompanyDTO();
        dto.setUserCompanyId(entity.getUserCompanyId());
        dto.setUserId(entity.getUser().getUserId());
        dto.setCompanyId(entity.getCompany().getCompanyId());
        dto.setRoleInCompanyId(entity.getRoleInCompany().getRoleInCompanyId());
        dto.setDeclaredAt(entity.getDeclaredAt());
        dto.setCurrent(entity.isCurrent());
        return dto;
    }

    public static UserCompany toEntity(UserCompanyDTO dto, User user,
                                       Company company, RoleInCompany role) {
        return new UserCompany(
                dto.getUserCompanyId(),
                user,
                company,
                role,
                dto.getDeclaredAt(),
                dto.isCurrent()
        );
    }
}
