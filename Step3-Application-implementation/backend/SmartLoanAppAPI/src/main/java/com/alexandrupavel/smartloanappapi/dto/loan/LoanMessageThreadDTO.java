package com.alexandrupavel.smartloanappapi.dto.loan;

import java.time.LocalDateTime;

public class LoanMessageThreadDTO {

    private Long id;
    private String subject;
    private LocalDateTime createdAt;
    private Long loanApplicationId;

    // Getters & Setters
    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public String getSubject() { return subject; }

    public void setSubject(String subject) { this.subject = subject; }

    public LocalDateTime getCreatedAt() { return createdAt; }

    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public Long getLoanApplicationId() { return loanApplicationId; }

    public void setLoanApplicationId(Long loanApplicationId) { this.loanApplicationId = loanApplicationId; }
}
