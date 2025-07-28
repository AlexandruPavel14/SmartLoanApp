package com.alexandrupavel.smartloanappapi.service.geo;

import com.alexandrupavel.smartloanappapi.dto.geo.CountyDTO;
import com.alexandrupavel.smartloanappapi.model.geo.County;
import com.alexandrupavel.smartloanappapi.repository.geo.CountyRepository;
import com.alexandrupavel.smartloanappapi.util.geo.CountyMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CountyService {

    private final CountyRepository repo;

    public CountyService(CountyRepository repo) {
        this.repo = repo;
    }

    public CountyDTO create(CountyDTO dto) {
        County entity = CountyMapper.toEntity(dto);
        return CountyMapper.toDTO(repo.save(entity));
    }

    public List<CountyDTO> findAll() {
        return repo.findAll().stream()
                .map(CountyMapper::toDTO)
                .collect(Collectors.toList());
    }
}
