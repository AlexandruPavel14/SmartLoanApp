package com.alexandrupavel.smartloanappapi.service.marketplace;

import com.alexandrupavel.smartloanappapi.dto.marketplace.ProjectTypeDTO;
import com.alexandrupavel.smartloanappapi.model.marketplace.ProjectType;
import com.alexandrupavel.smartloanappapi.repository.marketplace.ProjectTypeRepository;
import com.alexandrupavel.smartloanappapi.util.marketplace.ProjectTypeMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProjectTypeService {

    private final ProjectTypeRepository repo;

    public ProjectTypeService(ProjectTypeRepository repo) {
        this.repo = repo;
    }

    public ProjectTypeDTO create(ProjectTypeDTO dto) {
        ProjectType entity = ProjectTypeMapper.toEntity(dto);
        return ProjectTypeMapper.toDTO(repo.save(entity));
    }

    public List<ProjectTypeDTO> list() {
        return repo.findAll().stream()
                .map(ProjectTypeMapper::toDTO)
                .collect(Collectors.toList());
    }
}
