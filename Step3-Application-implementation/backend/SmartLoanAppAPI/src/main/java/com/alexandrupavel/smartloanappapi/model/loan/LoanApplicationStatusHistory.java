package com.alexandrupavel.smartloanappapi.model.loan;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "loan_application_status_history")
public class LoanApplicationStatusHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long loanApplicationId;
    private Long statusId;
    private Long changedBy;
    private LocalDateTime changedAt;
    private String note;

    public LoanApplicationStatusHistory() {}

    public LoanApplicationStatusHistory(Long id, Long loanApplicationId, Long statusId, Long changedBy,
                                        LocalDateTime changedAt, String note) {
        this.id = id;
        this.loanApplicationId = loanApplicationId;
        this.statusId = statusId;
        this.changedBy = changedBy;
        this.changedAt = changedAt;
        this.note = note;
    }

    @PrePersist
    protected void onCreate() {
        this.changedAt = LocalDateTime.now();
    }

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Long getLoanApplicationId() { return loanApplicationId; }
    public void setLoanApplicationId(Long loanApplicationId) { this.loanApplicationId = loanApplicationId; }

    public Long getStatusId() { return statusId; }
    public void setStatusId(Long statusId) { this.statusId = statusId; }

    public Long getChangedBy() { return changedBy; }
    public void setChangedBy(Long changedBy) { this.changedBy = changedBy; }

    public LocalDateTime getChangedAt() { return changedAt; }
    public void setChangedAt(LocalDateTime changedAt) { this.changedAt = changedAt; }

    public String getNote() { return note; }
    public void setNote(String note) { this.note = note; }
}
