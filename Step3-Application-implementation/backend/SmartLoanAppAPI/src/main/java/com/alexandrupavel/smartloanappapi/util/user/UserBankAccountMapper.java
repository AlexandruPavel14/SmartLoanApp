package com.alexandrupavel.smartloanappapi.util.user;

import com.alexandrupavel.smartloanappapi.dto.user.UserBankAccountDTO;
import com.alexandrupavel.smartloanappapi.model.user.UserBankAccount;

public class UserBankAccountMapper {

    public static UserBankAccountDTO toDTO(UserBankAccount entity) {
        UserBankAccountDTO dto = new UserBankAccountDTO();
        dto.setUserBankAccountId(entity.getUserBankAccountId());
        dto.setUserId(entity.getUserId());
        dto.setIban(entity.getIban());
        dto.setBankId(entity.getBankId());
        dto.setCurrencyId(entity.getCurrencyId());
        dto.setIsPreferred(entity.getIsPreferred());
        return dto;
    }

    public static UserBankAccount toEntity(UserBankAccountDTO dto) {
        return new UserBankAccount(
                dto.getUserBankAccountId(),
                dto.getUserId(),
                dto.getIban(),
                dto.getBankId(),
                dto.getCurrencyId(),
                dto.getIsPreferred()
        );
    }
}
