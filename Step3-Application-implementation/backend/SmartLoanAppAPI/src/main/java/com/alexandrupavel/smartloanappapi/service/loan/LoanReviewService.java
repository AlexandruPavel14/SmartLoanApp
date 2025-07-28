package com.alexandrupavel.smartloanappapi.service.loan;

import com.alexandrupavel.smartloanappapi.dto.loan.LoanReviewDTO;
import com.alexandrupavel.smartloanappapi.model.loan.GreenLoanApplication;
import com.alexandrupavel.smartloanappapi.model.loan.LoanReview;
import com.alexandrupavel.smartloanappapi.repository.loan.GreenLoanApplicationRepository;
import com.alexandrupavel.smartloanappapi.repository.loan.LoanReviewRepository;
import com.alexandrupavel.smartloanappapi.util.loan.LoanReviewMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class LoanReviewService {

    private final LoanReviewRepository repo;
    private final GreenLoanApplicationRepository loanRepo;

    public LoanReviewService(LoanReviewRepository repo, GreenLoanApplicationRepository loanRepo) {
        this.repo = repo;
        this.loanRepo = loanRepo;
    }

    public LoanReviewDTO create(LoanReviewDTO dto) {
        GreenLoanApplication app = loanRepo.findById(dto.getLoanApplicationId())
                .orElseThrow(() -> new IllegalArgumentException("Loan application not found"));
        LoanReview entity = LoanReviewMapper.toEntity(dto, app);
        return LoanReviewMapper.toDTO(repo.save(entity));
    }

    public List<LoanReviewDTO> findAll() {
        return repo.findAll()
                .stream()
                .map(LoanReviewMapper::toDTO)
                .collect(Collectors.toList());
    }
}
