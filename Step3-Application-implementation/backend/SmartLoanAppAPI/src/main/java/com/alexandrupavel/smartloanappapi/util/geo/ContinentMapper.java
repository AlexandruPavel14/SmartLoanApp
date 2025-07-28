package com.alexandrupavel.smartloanappapi.util.geo;

import com.alexandrupavel.smartloanappapi.dto.geo.ContinentDTO;
import com.alexandrupavel.smartloanappapi.model.geo.Continent;

public class ContinentMapper {

    public static ContinentDTO toDTO(Continent entity) {
        ContinentDTO dto = new ContinentDTO();
        dto.setContinentId(entity.getContinentId());
        dto.setContinentName(entity.getContinentName());
        return dto;
    }

    public static Continent toEntity(ContinentDTO dto) {
        return new Continent(dto.getContinentId(), dto.getContinentName());
    }
}
