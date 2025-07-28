package com.alexandrupavel.smartloanappapi.service.company;

import com.alexandrupavel.smartloanappapi.dto.company.CompanyLegalPrefixDTO;
import com.alexandrupavel.smartloanappapi.model.company.CompanyLegalPrefix;
import com.alexandrupavel.smartloanappapi.repository.company.CompanyLegalPrefixRepository;
import com.alexandrupavel.smartloanappapi.util.company.CompanyLegalPrefixMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CompanyLegalPrefixService {

    private final CompanyLegalPrefixRepository repo;

    public CompanyLegalPrefixService(CompanyLegalPrefixRepository repo) {
        this.repo = repo;
    }

    public CompanyLegalPrefixDTO create(CompanyLegalPrefixDTO dto) {
        CompanyLegalPrefix entity = CompanyLegalPrefixMapper.toEntity(dto);
        return CompanyLegalPrefixMapper.toDTO(repo.save(entity));
    }

    public List<CompanyLegalPrefixDTO> findAll() {
        return repo.findAll().stream()
                .map(CompanyLegalPrefixMapper::toDTO)
                .collect(Collectors.toList());
    }
}
