package com.alexandrupavel.smartloanappapi.service.geo;

import com.alexandrupavel.smartloanappapi.dto.geo.ContinentDTO;
import com.alexandrupavel.smartloanappapi.model.geo.Continent;
import com.alexandrupavel.smartloanappapi.repository.geo.ContinentRepository;
import com.alexandrupavel.smartloanappapi.util.geo.ContinentMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ContinentService {

    private final ContinentRepository repo;

    public ContinentService(ContinentRepository repo) {
        this.repo = repo;
    }

    public ContinentDTO create(ContinentDTO dto) {
        Continent entity = ContinentMapper.toEntity(dto);
        return ContinentMapper.toDTO(repo.save(entity));
    }

    public List<ContinentDTO> findAll() {
        return repo.findAll().stream()
                .map(ContinentMapper::toDTO)
                .collect(Collectors.toList());
    }
}
