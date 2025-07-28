package com.alexandrupavel.smartloanappapi.util.bank;

import com.alexandrupavel.smartloanappapi.dto.bank.CurrencyDTO;
import com.alexandrupavel.smartloanappapi.model.bank.Currency;

public class CurrencyMapper {

    public static CurrencyDTO toDTO(Currency entity) {
        CurrencyDTO dto = new CurrencyDTO();
        dto.setCurrencyId(entity.getCurrencyId());
        dto.setCurrencyCode(entity.getCurrencyCode());
        dto.setCurrencySymbol(entity.getCurrencySymbol());
        return dto;
    }

    public static Currency toEntity(CurrencyDTO dto) {
        return new Currency(dto.getCurrencyId(), dto.getCurrencyCode(), dto.getCurrencySymbol());
    }
}
