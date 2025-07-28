package com.alexandrupavel.smartloanappapi.repository.loan;

import com.alexandrupavel.smartloanappapi.model.company.LoanApplicationAttachment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoanApplicationAttachmentRepository extends JpaRepository<LoanApplicationAttachment, Long> {
}
