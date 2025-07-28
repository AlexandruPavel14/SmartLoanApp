package com.alexandrupavel.smartloanappapi.service.bank;

import com.alexandrupavel.smartloanappapi.dto.bank.InvestmentCategoryDTO;
import com.alexandrupavel.smartloanappapi.model.bank.InvestmentCategory;
import com.alexandrupavel.smartloanappapi.repository.bank.InvestmentCategoryRepository;
import com.alexandrupavel.smartloanappapi.util.bank.InvestmentCategoryMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class InvestmentCategoryService {

    private final InvestmentCategoryRepository repository;

    public InvestmentCategoryService(InvestmentCategoryRepository repository) {
        this.repository = repository;
    }

    public InvestmentCategoryDTO create(InvestmentCategoryDTO dto) {
        InvestmentCategory entity = InvestmentCategoryMapper.toEntity(dto);
        return InvestmentCategoryMapper.toDTO(repository.save(entity));
    }

    public List<InvestmentCategoryDTO> findAll() {
        return repository.findAll()
                .stream()
                .map(InvestmentCategoryMapper::toDTO)
                .collect(Collectors.toList());
    }
}
