package com.alexandrupavel.smartloanappapi.service.file;

import com.alexandrupavel.smartloanappapi.dto.file.ResourcePathDTO;
import com.alexandrupavel.smartloanappapi.model.file.*;
import com.alexandrupavel.smartloanappapi.repository.file.*;
import com.alexandrupavel.smartloanappapi.util.file.ResourcePathMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ResourcePathService {

    private final ResourcePathRepository repository;
    private final CommonBasePathRepository commonRepo;
    private final SpecificBasePathRepository specificRepo;
    private final ResourceTypeRepository resourceTypeRepo;
    private final FileExtensionRepository fileExtRepo;

    public ResourcePathService(ResourcePathRepository repository,
                               CommonBasePathRepository commonRepo,
                               SpecificBasePathRepository specificRepo,
                               ResourceTypeRepository resourceTypeRepo,
                               FileExtensionRepository fileExtRepo) {
        this.repository = repository;
        this.commonRepo = commonRepo;
        this.specificRepo = specificRepo;
        this.resourceTypeRepo = resourceTypeRepo;
        this.fileExtRepo = fileExtRepo;
    }

    public ResourcePathDTO create(ResourcePathDTO dto) {
        CommonBasePath cbp = commonRepo.findById(dto.getCommonBasePathId()).orElseThrow();
        SpecificBasePath sbp = specificRepo.findById(dto.getSpecificBasePathId()).orElseThrow();
        ResourceType rt = resourceTypeRepo.findById(dto.getResourceTypeId()).orElseThrow();
        FileExtension fe = fileExtRepo.findById(dto.getFileExtensionId()).orElseThrow();

        ResourcePath entity = ResourcePathMapper.toEntity(dto, cbp, sbp, rt, fe);
        return ResourcePathMapper.toDTO(repository.save(entity));
    }

    public List<ResourcePathDTO> findAll() {
        return repository.findAll().stream()
                .map(ResourcePathMapper::toDTO)
                .collect(Collectors.toList());
    }
}
