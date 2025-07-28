package com.alexandrupavel.smartloanappapi.repository.loan;

import com.alexandrupavel.smartloanappapi.model.loan.LoanReview;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoanReviewRepository extends JpaRepository<LoanReview, Long> {
}
