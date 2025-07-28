package com.alexandrupavel.smartloanappapi.service.geo;

import com.alexandrupavel.smartloanappapi.dto.geo.CityDTO;
import com.alexandrupavel.smartloanappapi.model.geo.City;
import com.alexandrupavel.smartloanappapi.repository.geo.CityRepository;
import com.alexandrupavel.smartloanappapi.util.geo.CityMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CityService {

    private final CityRepository repo;

    public CityService(CityRepository repo) {
        this.repo = repo;
    }

    public CityDTO create(CityDTO dto) {
        City city = CityMapper.toEntity(dto);
        return CityMapper.toDTO(repo.save(city));
    }

    public List<CityDTO> findAll() {
        return repo.findAll().stream()
                .map(CityMapper::toDTO)
                .collect(Collectors.toList());
    }
}
