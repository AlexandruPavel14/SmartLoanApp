package com.alexandrupavel.smartloanappapi.service.file;

import com.alexandrupavel.smartloanappapi.dto.file.AttachmentTypeDTO;
import com.alexandrupavel.smartloanappapi.model.file.AttachmentType;
import com.alexandrupavel.smartloanappapi.repository.file.AttachmentTypeRepository;
import com.alexandrupavel.smartloanappapi.util.file.AttachmentTypeMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AttachmentTypeService {

    private final AttachmentTypeRepository repository;

    public AttachmentTypeService(AttachmentTypeRepository repository) {
        this.repository = repository;
    }

    public AttachmentTypeDTO create(AttachmentTypeDTO dto) {
        AttachmentType entity = AttachmentTypeMapper.toEntity(dto);
        return AttachmentTypeMapper.toDTO(repository.save(entity));
    }

    public List<AttachmentTypeDTO> findAll() {
        return repository.findAll()
                .stream()
                .map(AttachmentTypeMapper::toDTO)
                .collect(Collectors.toList());
    }
}
