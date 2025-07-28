package com.alexandrupavel.smartloanappapi.service.geo;

import com.alexandrupavel.smartloanappapi.dto.geo.CountryDTO;
import com.alexandrupavel.smartloanappapi.model.geo.Country;
import com.alexandrupavel.smartloanappapi.repository.geo.CountryRepository;
import com.alexandrupavel.smartloanappapi.util.geo.CountryMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CountryService {

    private final CountryRepository repo;

    public CountryService(CountryRepository repo) {
        this.repo = repo;
    }

    public CountryDTO create(CountryDTO dto) {
        Country country = CountryMapper.toEntity(dto);
        return CountryMapper.toDTO(repo.save(country));
    }

    public List<CountryDTO> findAll() {
        return repo.findAll().stream()
                .map(CountryMapper::toDTO)
                .collect(Collectors.toList());
    }
}
