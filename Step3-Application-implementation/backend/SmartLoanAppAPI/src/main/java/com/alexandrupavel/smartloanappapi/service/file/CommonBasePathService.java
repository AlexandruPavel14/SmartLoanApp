package com.alexandrupavel.smartloanappapi.service.file;

import com.alexandrupavel.smartloanappapi.dto.file.CommonBasePathDTO;
import com.alexandrupavel.smartloanappapi.model.file.CommonBasePath;
import com.alexandrupavel.smartloanappapi.repository.file.CommonBasePathRepository;
import com.alexandrupavel.smartloanappapi.util.file.CommonBasePathMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CommonBasePathService {

    private final CommonBasePathRepository repository;

    public CommonBasePathService(CommonBasePathRepository repository) {
        this.repository = repository;
    }

    public CommonBasePathDTO create(CommonBasePathDTO dto) {
        CommonBasePath entity = CommonBasePathMapper.toEntity(dto);
        return CommonBasePathMapper.toDTO(repository.save(entity));
    }

    public List<CommonBasePathDTO> findAll() {
        return repository.findAll()
                .stream()
                .map(CommonBasePathMapper::toDTO)
                .collect(Collectors.toList());
    }
}
