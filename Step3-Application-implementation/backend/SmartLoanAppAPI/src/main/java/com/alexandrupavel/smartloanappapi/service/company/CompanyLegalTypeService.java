package com.alexandrupavel.smartloanappapi.service.company;

import com.alexandrupavel.smartloanappapi.dto.company.CompanyLegalTypeDTO;
import com.alexandrupavel.smartloanappapi.model.company.CompanyLegalType;
import com.alexandrupavel.smartloanappapi.repository.company.CompanyLegalTypeRepository;
import com.alexandrupavel.smartloanappapi.util.company.CompanyLegalTypeMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CompanyLegalTypeService {

    private final CompanyLegalTypeRepository repo;

    public CompanyLegalTypeService(CompanyLegalTypeRepository repo) {
        this.repo = repo;
    }

    public CompanyLegalTypeDTO create(CompanyLegalTypeDTO dto) {
        CompanyLegalType entity = CompanyLegalTypeMapper.toEntity(dto);
        return CompanyLegalTypeMapper.toDTO(repo.save(entity));
    }

    public List<CompanyLegalTypeDTO> findAll() {
        return repo.findAll().stream()
                .map(CompanyLegalTypeMapper::toDTO)
                .collect(Collectors.toList());
    }
}
