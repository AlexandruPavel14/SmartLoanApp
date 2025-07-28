package com.alexandrupavel.smartloanappapi.util.income;

import com.alexandrupavel.smartloanappapi.dto.income.IncomeBracketDTO;
import com.alexandrupavel.smartloanappapi.model.income.IncomeBracket;

public class IncomeBracketMapper {

    public static IncomeBracketDTO toDTO(IncomeBracket entity) {
        IncomeBracketDTO dto = new IncomeBracketDTO();
        dto.setId(entity.getId());
        dto.setIncomeOverview(entity.getIncomeOverview());
        return dto;
    }

    public static IncomeBracket toEntity(IncomeBracketDTO dto) {
        return new IncomeBracket(dto.getId(), dto.getIncomeOverview());
    }
}
