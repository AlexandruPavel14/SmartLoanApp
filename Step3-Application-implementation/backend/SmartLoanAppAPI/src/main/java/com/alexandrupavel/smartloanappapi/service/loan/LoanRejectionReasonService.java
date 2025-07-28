package com.alexandrupavel.smartloanappapi.service.loan;

import com.alexandrupavel.smartloanappapi.dto.loan.LoanRejectionReasonDTO;
import com.alexandrupavel.smartloanappapi.model.loan.LoanRejectionReason;
import com.alexandrupavel.smartloanappapi.repository.loan.LoanRejectionReasonRepository;
import com.alexandrupavel.smartloanappapi.util.loan.LoanRejectionReasonMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class LoanRejectionReasonService {

    private final LoanRejectionReasonRepository repository;

    public LoanRejectionReasonService(LoanRejectionReasonRepository repository) {
        this.repository = repository;
    }

    public LoanRejectionReasonDTO create(LoanRejectionReasonDTO dto) {
        LoanRejectionReason entity = LoanRejectionReasonMapper.toEntity(dto);
        return LoanRejectionReasonMapper.toDTO(repository.save(entity));
    }

    public List<LoanRejectionReasonDTO> findAll() {
        return repository.findAll()
                .stream()
                .map(LoanRejectionReasonMapper::toDTO)
                .collect(Collectors.toList());
    }
}
