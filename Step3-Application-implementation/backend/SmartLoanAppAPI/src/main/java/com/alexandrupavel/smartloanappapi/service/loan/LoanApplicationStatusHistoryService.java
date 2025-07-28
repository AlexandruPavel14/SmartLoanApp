package com.alexandrupavel.smartloanappapi.service.loan;

import com.alexandrupavel.smartloanappapi.dto.loan.LoanApplicationStatusHistoryDTO;
import com.alexandrupavel.smartloanappapi.model.loan.LoanApplicationStatusHistory;
import com.alexandrupavel.smartloanappapi.repository.loan.LoanApplicationStatusHistoryRepository;
import com.alexandrupavel.smartloanappapi.util.loan.LoanApplicationStatusHistoryMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class LoanApplicationStatusHistoryService {

    private final LoanApplicationStatusHistoryRepository repo;

    public LoanApplicationStatusHistoryService(LoanApplicationStatusHistoryRepository repo) {
        this.repo = repo;
    }

    public LoanApplicationStatusHistoryDTO create(LoanApplicationStatusHistoryDTO dto) {
        LoanApplicationStatusHistory entity = LoanApplicationStatusHistoryMapper.toEntity(dto);
        return LoanApplicationStatusHistoryMapper.toDTO(repo.save(entity));
    }

    public List<LoanApplicationStatusHistoryDTO> findAll() {
        return repo.findAll()
                .stream()
                .map(LoanApplicationStatusHistoryMapper::toDTO)
                .collect(Collectors.toList());
    }
}
