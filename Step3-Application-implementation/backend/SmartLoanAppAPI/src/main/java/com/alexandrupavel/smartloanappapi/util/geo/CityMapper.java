package com.alexandrupavel.smartloanappapi.util.geo;

import com.alexandrupavel.smartloanappapi.dto.geo.CityDTO;
import com.alexandrupavel.smartloanappapi.model.geo.City;

public class CityMapper {

    public static CityDTO toDTO(City city) {
        CityDTO dto = new CityDTO();
        dto.setCityId(city.getCityId());
        dto.setCityName(city.getCityName());
        return dto;
    }

    public static City toEntity(CityDTO dto) {
        return new City(dto.getCityId(), dto.getCityName());
    }
}
