package com.alexandrupavel.smartloanappapi.util.user;

import com.alexandrupavel.smartloanappapi.dto.user.PersonTypeDTO;
import com.alexandrupavel.smartloanappapi.model.user.PersonType;

public class PersonTypeMapper {

    public static PersonTypeDTO toDTO(PersonType entity) {
        PersonTypeDTO dto = new PersonTypeDTO();
        dto.setPersonTypeId(entity.getPersonTypeId());
        dto.setTypeLabel(entity.getTypeLabel());
        return dto;
    }

    public static PersonType toEntity(PersonTypeDTO dto) {
        return new PersonType(dto.getPersonTypeId(), dto.getTypeLabel());
    }
}
