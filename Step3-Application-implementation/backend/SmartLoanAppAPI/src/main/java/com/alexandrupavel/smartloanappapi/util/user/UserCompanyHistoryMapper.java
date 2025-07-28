package com.alexandrupavel.smartloanappapi.util.user;

import com.alexandrupavel.smartloanappapi.dto.user.UserCompanyHistoryDTO;
import com.alexandrupavel.smartloanappapi.model.company.Company;
import com.alexandrupavel.smartloanappapi.model.company.RoleInCompany;
import com.alexandrupavel.smartloanappapi.model.user.User;
import com.alexandrupavel.smartloanappapi.model.user.UserCompanyHistory;

public class UserCompanyHistoryMapper {

    public static UserCompanyHistoryDTO toDTO(UserCompanyHistory entity) {
        UserCompanyHistoryDTO dto = new UserCompanyHistoryDTO();
        dto.setHistoryId(entity.getHistoryId());
        dto.setUserId(entity.getUser().getUserId());
        dto.setCompanyId(entity.getCompany().getCompanyId());
        dto.setRoleInCompanyId(entity.getRoleInCompany().getRoleInCompanyId());
        dto.setDeclaredAt(entity.getDeclaredAt());
        dto.setCurrent(entity.isCurrent());
        return dto;
    }

    public static UserCompanyHistory toEntity(UserCompanyHistoryDTO dto, User user,
                                              Company company, RoleInCompany role) {
        return new UserCompanyHistory(
                dto.getHistoryId(),
                user,
                company,
                role,
                dto.getDeclaredAt(),
                dto.isCurrent()
        );
    }
}
