package com.alexandrupavel.smartloanappapi.service.loan;

import com.alexandrupavel.smartloanappapi.dto.loan.GreenLoanApplicationDTO;
import com.alexandrupavel.smartloanappapi.model.loan.GreenLoanApplication;
import com.alexandrupavel.smartloanappapi.repository.loan.GreenLoanApplicationRepository;
import com.alexandrupavel.smartloanappapi.util.loan.GreenLoanApplicationMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class GreenLoanApplicationService {

    private final GreenLoanApplicationRepository repo;

    public GreenLoanApplicationService(GreenLoanApplicationRepository repo) {
        this.repo = repo;
    }

    public GreenLoanApplicationDTO create(GreenLoanApplicationDTO dto) {
        GreenLoanApplication entity = GreenLoanApplicationMapper.toEntity(dto);
        return GreenLoanApplicationMapper.toDTO(repo.save(entity));
    }

    public List<GreenLoanApplicationDTO> findAll() {
        return repo.findAll().stream()
                .map(GreenLoanApplicationMapper::toDTO)
                .collect(Collectors.toList());
    }
}
