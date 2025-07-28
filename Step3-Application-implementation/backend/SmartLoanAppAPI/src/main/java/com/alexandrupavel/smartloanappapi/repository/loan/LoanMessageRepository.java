package com.alexandrupavel.smartloanappapi.repository.loan;

import com.alexandrupavel.smartloanappapi.model.loan.LoanMessage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoanMessageRepository extends JpaRepository<LoanMessage, Long> {
}
