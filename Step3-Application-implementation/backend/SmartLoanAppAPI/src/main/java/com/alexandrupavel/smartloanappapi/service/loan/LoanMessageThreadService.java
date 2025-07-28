package com.alexandrupavel.smartloanappapi.service.loan;

import com.alexandrupavel.smartloanappapi.dto.loan.LoanMessageThreadDTO;
import com.alexandrupavel.smartloanappapi.model.loan.GreenLoanApplication;
import com.alexandrupavel.smartloanappapi.model.loan.LoanMessageThread;
import com.alexandrupavel.smartloanappapi.repository.loan.GreenLoanApplicationRepository;
import com.alexandrupavel.smartloanappapi.repository.loan.LoanMessageThreadRepository;
import com.alexandrupavel.smartloanappapi.util.loan.LoanMessageThreadMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class LoanMessageThreadService {

    private final LoanMessageThreadRepository repo;
    private final GreenLoanApplicationRepository loanRepo;

    public LoanMessageThreadService(LoanMessageThreadRepository repo, GreenLoanApplicationRepository loanRepo) {
        this.repo = repo;
        this.loanRepo = loanRepo;
    }

    public LoanMessageThreadDTO create(LoanMessageThreadDTO dto) {
        GreenLoanApplication app = loanRepo.findById(dto.getLoanApplicationId())
                .orElseThrow(() -> new IllegalArgumentException("Loan application not found"));
        LoanMessageThread entity = LoanMessageThreadMapper.toEntity(dto, app);
        return LoanMessageThreadMapper.toDTO(repo.save(entity));
    }

    public List<LoanMessageThreadDTO> findAll() {
        return repo.findAll()
                .stream()
                .map(LoanMessageThreadMapper::toDTO)
                .collect(Collectors.toList());
    }
}
