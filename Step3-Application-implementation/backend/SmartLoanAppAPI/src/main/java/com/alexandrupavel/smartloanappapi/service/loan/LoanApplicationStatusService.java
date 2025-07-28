package com.alexandrupavel.smartloanappapi.service.loan;

import com.alexandrupavel.smartloanappapi.dto.loan.LoanApplicationStatusDTO;
import com.alexandrupavel.smartloanappapi.model.loan.LoanApplicationStatus;
import com.alexandrupavel.smartloanappapi.repository.loan.LoanApplicationStatusRepository;
import com.alexandrupavel.smartloanappapi.util.loan.LoanApplicationStatusMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class LoanApplicationStatusService {

    private final LoanApplicationStatusRepository repository;

    public LoanApplicationStatusService(LoanApplicationStatusRepository repository) {
        this.repository = repository;
    }

    public LoanApplicationStatusDTO create(LoanApplicationStatusDTO dto) {
        LoanApplicationStatus entity = LoanApplicationStatusMapper.toEntity(dto);
        return LoanApplicationStatusMapper.toDTO(repository.save(entity));
    }

    public List<LoanApplicationStatusDTO> findAll() {
        return repository.findAll()
                .stream()
                .map(LoanApplicationStatusMapper::toDTO)
                .collect(Collectors.toList());
    }
}
