package com.alexandrupavel.smartloanappapi.service.file;

import com.alexandrupavel.smartloanappapi.dto.file.FileExtensionDTO;
import com.alexandrupavel.smartloanappapi.model.file.FileExtension;
import com.alexandrupavel.smartloanappapi.model.file.ResourceType;
import com.alexandrupavel.smartloanappapi.repository.file.FileExtensionRepository;
import com.alexandrupavel.smartloanappapi.repository.file.ResourceTypeRepository;
import com.alexandrupavel.smartloanappapi.util.file.FileExtensionMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class FileExtensionService {

    private final FileExtensionRepository fileExtensionRepo;
    private final ResourceTypeRepository resourceTypeRepo;

    public FileExtensionService(FileExtensionRepository fileExtensionRepo, ResourceTypeRepository resourceTypeRepo) {
        this.fileExtensionRepo = fileExtensionRepo;
        this.resourceTypeRepo = resourceTypeRepo;
    }

    public FileExtensionDTO create(FileExtensionDTO dto) {
        ResourceType resourceType = resourceTypeRepo.findById(dto.getResourceTypeId())
                .orElseThrow(() -> new IllegalArgumentException("ResourceType not found"));
        FileExtension entity = FileExtensionMapper.toEntity(dto, resourceType);
        return FileExtensionMapper.toDTO(fileExtensionRepo.save(entity));
    }

    public List<FileExtensionDTO> findAll() {
        return fileExtensionRepo.findAll()
                .stream()
                .map(FileExtensionMapper::toDTO)
                .collect(Collectors.toList());
    }
}
