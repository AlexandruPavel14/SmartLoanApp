package com.alexandrupavel.smartloanappapi.model.loan;

import jakarta.persistence.*;

@Entity
@Table(name = "loan_rejection_reasons")
public class LoanRejectionReason {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String reasonText;

    public LoanRejectionReason() {}

    public LoanRejectionReason(Long id, String reasonText) {
        this.id = id;
        this.reasonText = reasonText;
    }

    // Getters & Setters
    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public String getReasonText() { return reasonText; }

    public void setReasonText(String reasonText) { this.reasonText = reasonText; }
}
