package com.alexandrupavel.smartloanappapi.util.geo;

import com.alexandrupavel.smartloanappapi.dto.geo.PhoneNumberFormatDTO;
import com.alexandrupavel.smartloanappapi.model.geo.PhoneNumberFormat;

public class PhoneNumberFormatMapper {

    public static PhoneNumberFormatDTO toDTO(PhoneNumberFormat entity) {
        PhoneNumberFormatDTO dto = new PhoneNumberFormatDTO();
        dto.setPhoneNumberFormatId(entity.getPhoneNumberFormatId());
        dto.setCountryCode(entity.getCountryCode());
        return dto;
    }

    public static PhoneNumberFormat toEntity(PhoneNumberFormatDTO dto) {
        return new PhoneNumberFormat(dto.getPhoneNumberFormatId(), dto.getCountryCode());
    }
}
