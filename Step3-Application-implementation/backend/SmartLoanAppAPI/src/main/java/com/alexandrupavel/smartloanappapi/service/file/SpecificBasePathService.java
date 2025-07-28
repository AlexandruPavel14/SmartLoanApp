package com.alexandrupavel.smartloanappapi.service.file;

import com.alexandrupavel.smartloanappapi.dto.file.SpecificBasePathDTO;
import com.alexandrupavel.smartloanappapi.model.file.SpecificBasePath;
import com.alexandrupavel.smartloanappapi.repository.file.SpecificBasePathRepository;
import com.alexandrupavel.smartloanappapi.util.file.SpecificBasePathMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SpecificBasePathService {

    private final SpecificBasePathRepository repository;

    public SpecificBasePathService(SpecificBasePathRepository repository) {
        this.repository = repository;
    }

    public SpecificBasePathDTO create(SpecificBasePathDTO dto) {
        SpecificBasePath entity = SpecificBasePathMapper.toEntity(dto);
        return SpecificBasePathMapper.toDTO(repository.save(entity));
    }

    public List<SpecificBasePathDTO> findAll() {
        return repository.findAll()
                .stream()
                .map(SpecificBasePathMapper::toDTO)
                .collect(Collectors.toList());
    }
}
