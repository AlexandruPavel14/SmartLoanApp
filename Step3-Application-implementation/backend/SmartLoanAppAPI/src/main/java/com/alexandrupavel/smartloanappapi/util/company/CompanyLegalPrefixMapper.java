package com.alexandrupavel.smartloanappapi.util.company;

import com.alexandrupavel.smartloanappapi.dto.company.CompanyLegalPrefixDTO;
import com.alexandrupavel.smartloanappapi.model.company.CompanyLegalPrefix;

public class CompanyLegalPrefixMapper {

    public static CompanyLegalPrefixDTO toDTO(CompanyLegalPrefix entity) {
        CompanyLegalPrefixDTO dto = new CompanyLegalPrefixDTO();
        dto.setLegalPrefixId(entity.getLegalPrefixId());
        dto.setPrefix(entity.getPrefix());
        return dto;
    }

    public static CompanyLegalPrefix toEntity(CompanyLegalPrefixDTO dto) {
        return new CompanyLegalPrefix(
                dto.getLegalPrefixId(),
                dto.getPrefix()
        );
    }
}
