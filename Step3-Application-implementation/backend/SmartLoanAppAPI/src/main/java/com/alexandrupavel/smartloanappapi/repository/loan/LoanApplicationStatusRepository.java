package com.alexandrupavel.smartloanappapi.repository.loan;

import com.alexandrupavel.smartloanappapi.model.loan.LoanApplicationStatus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoanApplicationStatusRepository extends JpaRepository<LoanApplicationStatus, Long> {
}
