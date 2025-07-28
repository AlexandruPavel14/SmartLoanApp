package com.alexandrupavel.smartloanappapi.util.company;

import com.alexandrupavel.smartloanappapi.dto.company.CompanyDTO;
import com.alexandrupavel.smartloanappapi.model.company.Company;
import com.alexandrupavel.smartloanappapi.model.company.CompanyLegalPrefix;
import com.alexandrupavel.smartloanappapi.model.company.CompanyLegalType;
import com.alexandrupavel.smartloanappapi.model.geo.Country;

public class CompanyMapper {

    public static CompanyDTO toDTO(Company company) {
        CompanyDTO dto = new CompanyDTO();
        dto.setCompanyId(company.getCompanyId());
        dto.setCompanyName(company.getCompanyName());
        dto.setLegalPrefixId(company.getLegalPrefix().getLegalPrefixId());
        dto.setLegalTypeId(company.getLegalType().getLegalTypeId());
        dto.setRegistrationCode(company.getRegistrationCode());
        dto.setDunsCode(company.getDunsCode());
        dto.setFiscalAddress(company.getFiscalAddress());
        dto.setCountryId(company.getCountry().getCountryId());
        dto.setIsActive(company.isActive());
        return dto;
    }

    public static Company toEntity(CompanyDTO dto,
                                   CompanyLegalPrefix prefix,
                                   CompanyLegalType type,
                                   Country country) {
        return new Company(
                dto.getCompanyId(),
                dto.getCompanyName(),
                prefix,
                type,
                dto.getRegistrationCode(),
                dto.getDunsCode(),
                dto.getFiscalAddress(),
                country,
                dto.isActive()
        );
    }
}
