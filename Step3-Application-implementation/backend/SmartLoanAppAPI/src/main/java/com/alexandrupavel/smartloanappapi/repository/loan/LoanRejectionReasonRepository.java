package com.alexandrupavel.smartloanappapi.repository.loan;

import com.alexandrupavel.smartloanappapi.model.loan.LoanRejectionReason;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoanRejectionReasonRepository extends JpaRepository<LoanRejectionReason, Long> {
}
