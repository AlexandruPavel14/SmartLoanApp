package com.alexandrupavel.smartloanappapi.util.geo;

import com.alexandrupavel.smartloanappapi.dto.geo.CountryCityDTO;
import com.alexandrupavel.smartloanappapi.model.geo.CountryCity;

public class CountryCityMapper {

    public static CountryCityDTO toDTO(CountryCity entity) {
        CountryCityDTO dto = new CountryCityDTO();
        dto.setCountryCityId(entity.getCountryCityId());
        dto.setCountryId(entity.getCountryId());
        dto.setCountyId(entity.getCountyId());
        dto.setCityId(entity.getCityId());
        return dto;
    }

    public static CountryCity toEntity(CountryCityDTO dto) {
        return new CountryCity(
                dto.getCountryCityId(),
                dto.getCountryId(),
                dto.getCountyId(),
                dto.getCityId()
        );
    }
}
