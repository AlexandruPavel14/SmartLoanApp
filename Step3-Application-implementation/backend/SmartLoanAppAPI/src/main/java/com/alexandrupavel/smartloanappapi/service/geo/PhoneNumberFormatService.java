package com.alexandrupavel.smartloanappapi.service.geo;

import com.alexandrupavel.smartloanappapi.dto.geo.PhoneNumberFormatDTO;
import com.alexandrupavel.smartloanappapi.model.geo.PhoneNumberFormat;
import com.alexandrupavel.smartloanappapi.repository.geo.PhoneNumberFormatRepository;
import com.alexandrupavel.smartloanappapi.util.geo.PhoneNumberFormatMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PhoneNumberFormatService {

    private final PhoneNumberFormatRepository repo;

    public PhoneNumberFormatService(PhoneNumberFormatRepository repo) {
        this.repo = repo;
    }

    public PhoneNumberFormatDTO create(PhoneNumberFormatDTO dto) {
        PhoneNumberFormat entity = PhoneNumberFormatMapper.toEntity(dto);
        return PhoneNumberFormatMapper.toDTO(repo.save(entity));
    }

    public List<PhoneNumberFormatDTO> findAll() {
        return repo.findAll().stream()
                .map(PhoneNumberFormatMapper::toDTO)
                .collect(Collectors.toList());
    }
}
