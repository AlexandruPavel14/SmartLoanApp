package com.alexandrupavel.smartloanappapi.repository.loan;

import com.alexandrupavel.smartloanappapi.model.loan.LoanMessageThread;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoanMessageThreadRepository extends JpaRepository<LoanMessageThread, Long> {
}
