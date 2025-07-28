package com.alexandrupavel.smartloanappapi.service.loan;

import com.alexandrupavel.smartloanappapi.dto.loan.LoanTypeDTO;
import com.alexandrupavel.smartloanappapi.model.loan.LoanType;
import com.alexandrupavel.smartloanappapi.repository.loan.LoanTypeRepository;
import com.alexandrupavel.smartloanappapi.util.loan.LoanTypeMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class LoanTypeService {

    private final LoanTypeRepository repo;

    public LoanTypeService(LoanTypeRepository repo) {
        this.repo = repo;
    }

    public LoanTypeDTO create(LoanTypeDTO dto) {
        LoanType entity = LoanTypeMapper.toEntity(dto);
        return LoanTypeMapper.toDTO(repo.save(entity));
    }

    public List<LoanTypeDTO> list() {
        return repo.findAll().stream()
                .map(LoanTypeMapper::toDTO)
                .collect(Collectors.toList());
    }
}
