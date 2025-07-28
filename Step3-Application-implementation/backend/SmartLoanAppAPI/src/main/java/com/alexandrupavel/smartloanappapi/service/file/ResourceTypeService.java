package com.alexandrupavel.smartloanappapi.service.file;

import com.alexandrupavel.smartloanappapi.dto.file.ResourceTypeDTO;
import com.alexandrupavel.smartloanappapi.model.file.ResourceType;
import com.alexandrupavel.smartloanappapi.repository.file.ResourceTypeRepository;
import com.alexandrupavel.smartloanappapi.util.file.ResourceTypeMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ResourceTypeService {

    private final ResourceTypeRepository repository;

    public ResourceTypeService(ResourceTypeRepository repository) {
        this.repository = repository;
    }

    public ResourceTypeDTO create(ResourceTypeDTO dto) {
        ResourceType entity = ResourceTypeMapper.toEntity(dto);
        return ResourceTypeMapper.toDTO(repository.save(entity));
    }

    public List<ResourceTypeDTO> findAll() {
        return repository.findAll()
                .stream()
                .map(ResourceTypeMapper::toDTO)
                .collect(Collectors.toList());
    }
}
