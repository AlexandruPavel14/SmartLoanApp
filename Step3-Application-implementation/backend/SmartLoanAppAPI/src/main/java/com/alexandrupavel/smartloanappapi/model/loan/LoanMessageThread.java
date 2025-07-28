package com.alexandrupavel.smartloanappapi.model.loan;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "loan_message_threads")
public class LoanMessageThread {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String subject;

    private LocalDateTime createdAt;

    @ManyToOne
    @JoinColumn(name = "loan_application_id", nullable = false)
    private GreenLoanApplication loanApplication;

    public LoanMessageThread() {}

    public LoanMessageThread(Long id, String subject, LocalDateTime createdAt, GreenLoanApplication loanApplication) {
        this.id = id;
        this.subject = subject;
        this.createdAt = createdAt;
        this.loanApplication = loanApplication;
    }

    @PrePersist
    protected void onCreate() {
        this.createdAt = LocalDateTime.now();
    }

    // Getters & Setters
    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public String getSubject() { return subject; }

    public void setSubject(String subject) { this.subject = subject; }

    public LocalDateTime getCreatedAt() { return createdAt; }

    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public GreenLoanApplication getLoanApplication() { return loanApplication; }

    public void setLoanApplication(GreenLoanApplication loanApplication) {
        this.loanApplication = loanApplication;
    }
}
