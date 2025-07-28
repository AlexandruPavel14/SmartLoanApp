package com.alexandrupavel.smartloanappapi.util.geo;

import com.alexandrupavel.smartloanappapi.dto.geo.CountyDTO;
import com.alexandrupavel.smartloanappapi.model.geo.County;

public class CountyMapper {

    public static CountyDTO toDTO(County entity) {
        CountyDTO dto = new CountyDTO();
        dto.setCountyId(entity.getCountyId());
        dto.setCountyName(entity.getCountyName());
        return dto;
    }

    public static County toEntity(CountyDTO dto) {
        return new County(dto.getCountyId(), dto.getCountyName());
    }
}
