package com.alexandrupavel.smartloanappapi.service.geo;

import com.alexandrupavel.smartloanappapi.dto.geo.CountryCityDTO;
import com.alexandrupavel.smartloanappapi.model.geo.CountryCity;
import com.alexandrupavel.smartloanappapi.repository.geo.CountryCityRepository;
import com.alexandrupavel.smartloanappapi.util.geo.CountryCityMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CountryCityService {

    private final CountryCityRepository repo;

    public CountryCityService(CountryCityRepository repo) {
        this.repo = repo;
    }

    public CountryCityDTO create(CountryCityDTO dto) {
        CountryCity entity = CountryCityMapper.toEntity(dto);
        return CountryCityMapper.toDTO(repo.save(entity));
    }

    public List<CountryCityDTO> findAll() {
        return repo.findAll().stream()
                .map(CountryCityMapper::toDTO)
                .collect(Collectors.toList());
    }
}
