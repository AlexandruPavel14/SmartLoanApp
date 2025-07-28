package com.alexandrupavel.smartloanappapi.util.geo;

import com.alexandrupavel.smartloanappapi.dto.geo.CountryDTO;
import com.alexandrupavel.smartloanappapi.model.geo.Country;

public class CountryMapper {

    public static CountryDTO toDTO(Country country) {
        CountryDTO dto = new CountryDTO();
        dto.setCountryId(country.getCountryId());
        dto.setCountryName(country.getCountryName());
        dto.setCountryCode(country.getCountryCode());
        return dto;
    }

    public static Country toEntity(CountryDTO dto) {
        return new Country(dto.getCountryId(), dto.getCountryName(), dto.getCountryCode());
    }
}
