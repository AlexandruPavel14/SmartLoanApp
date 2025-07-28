package com.alexandrupavel.smartloanappapi.util.company;

import com.alexandrupavel.smartloanappapi.dto.company.CompanyLegalTypeDTO;
import com.alexandrupavel.smartloanappapi.model.company.CompanyLegalType;

public class CompanyLegalTypeMapper {

    public static CompanyLegalTypeDTO toDTO(CompanyLegalType entity) {
        CompanyLegalTypeDTO dto = new CompanyLegalTypeDTO();
        dto.setLegalTypeId(entity.getLegalTypeId());
        dto.setTypeLabel(entity.getTypeLabel());
        return dto;
    }

    public static CompanyLegalType toEntity(CompanyLegalTypeDTO dto) {
        return new CompanyLegalType(dto.getLegalTypeId(), dto.getTypeLabel());
    }
}
