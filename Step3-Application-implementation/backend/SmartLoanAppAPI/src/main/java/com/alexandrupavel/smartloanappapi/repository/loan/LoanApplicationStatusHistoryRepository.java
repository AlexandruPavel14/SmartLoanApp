package com.alexandrupavel.smartloanappapi.repository.loan;

import com.alexandrupavel.smartloanappapi.model.loan.LoanApplicationStatusHistory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoanApplicationStatusHistoryRepository extends JpaRepository<LoanApplicationStatusHistory, Long> {
}
