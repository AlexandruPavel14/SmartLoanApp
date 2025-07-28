package com.alexandrupavel.smartloanappapi.util.bank;

import com.alexandrupavel.smartloanappapi.dto.bank.BankDTO;
import com.alexandrupavel.smartloanappapi.model.bank.Bank;

public class BankMapper {

    public static BankDTO toDTO(Bank entity) {
        BankDTO dto = new BankDTO();
        dto.setBankId(entity.getBankId());
        dto.setBankName(entity.getBankName());
        return dto;
    }

    public static Bank toEntity(BankDTO dto) {
        return new Bank(dto.getBankId(), dto.getBankName());
    }
}
