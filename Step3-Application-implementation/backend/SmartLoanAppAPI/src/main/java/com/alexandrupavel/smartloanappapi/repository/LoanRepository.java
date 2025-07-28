package com.alexandrupavel.smartloanappapi.repository;

import com.alexandrupavel.smartloanappapi.model.Loan;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoanRepository extends JpaRepository<Loan, Long> {
}
