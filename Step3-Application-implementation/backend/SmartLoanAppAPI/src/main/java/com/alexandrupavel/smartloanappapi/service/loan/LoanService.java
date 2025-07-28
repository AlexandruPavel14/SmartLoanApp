package com.alexandrupavel.smartloanappapi.service.loan;

import com.alexandrupavel.smartloanappapi.dto.loan.LoanDTO;
import com.alexandrupavel.smartloanappapi.model.loan.Loan;
import com.alexandrupavel.smartloanappapi.repository.loan.LoanRepository;
import com.alexandrupavel.smartloanappapi.util.loan.LoanMapper;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class LoanService {
    private final LoanRepository repo;

    public LoanService(LoanRepository repo) {
        this.repo = repo;
    }

    public LoanDTO createLoan(LoanDTO dto) {
        Loan loan = LoanMapper.toEntity(dto);
        return LoanMapper.toDTO(repo.save(loan));
    }

    public List<LoanDTO> getAllLoans() {
        return repo.findAll().stream()
                .map(LoanMapper::toDTO)
                .collect(Collectors.toList());
    }

    public void insertMockData() {
        if (repo.count() == 0) {
            repo.save(new Loan(null, new BigDecimal("10000.50"), LocalDate.of(2024, 7, 26), 12));
            repo.save(new Loan(null, new BigDecimal("5000.00"), LocalDate.of(2024, 6, 15), 24));
            repo.save(new Loan(null, new BigDecimal("1500.75"), LocalDate.of(2024, 1, 10), 6));
        }
    }
}
