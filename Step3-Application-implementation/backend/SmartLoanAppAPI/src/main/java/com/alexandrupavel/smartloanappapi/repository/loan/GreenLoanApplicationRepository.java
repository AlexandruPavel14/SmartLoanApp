package com.alexandrupavel.smartloanappapi.repository.loan;

import com.alexandrupavel.smartloanappapi.model.loan.GreenLoanApplication;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GreenLoanApplicationRepository extends JpaRepository<GreenLoanApplication, Long> {
}
