package com.alexandrupavel.smartloanappapi.util.bank;

import com.alexandrupavel.smartloanappapi.dto.bank.InvestmentCategoryDTO;
import com.alexandrupavel.smartloanappapi.model.bank.InvestmentCategory;

public class InvestmentCategoryMapper {

    public static InvestmentCategoryDTO toDTO(InvestmentCategory entity) {
        InvestmentCategoryDTO dto = new InvestmentCategoryDTO();
        dto.setId(entity.getId());
        dto.setName(entity.getName());
        dto.setDescription(entity.getDescription());
        return dto;
    }

    public static InvestmentCategory toEntity(InvestmentCategoryDTO dto) {
        return new InvestmentCategory(
                dto.getId(),
                dto.getName(),
                dto.getDescription()
        );
    }
}
