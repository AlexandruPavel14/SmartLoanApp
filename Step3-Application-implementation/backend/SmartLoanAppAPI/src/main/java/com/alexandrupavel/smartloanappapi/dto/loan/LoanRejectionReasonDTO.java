package com.alexandrupavel.smartloanappapi.dto.loan;

public class LoanRejectionReasonDTO {

    private Long id;
    private String reasonText;

    // Getters & Setters
    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public String getReasonText() { return reasonText; }

    public void setReasonText(String reasonText) { this.reasonText = reasonText; }
}
