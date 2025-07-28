package com.alexandrupavel.smartloanappapi.model.loan;

import jakarta.persistence.*;

@Entity
@Table(name = "loan_application_statuses")
public class LoanApplicationStatus {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "status_label", nullable = false, unique = true)
    private String statusLabel;

    public LoanApplicationStatus() {
    }

    public LoanApplicationStatus(Long id, String statusLabel) {
        this.id = id;
        this.statusLabel = statusLabel;
    }

    public Long getId() {
        return id;
    }

    public String getStatusLabel() {
        return statusLabel;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setStatusLabel(String statusLabel) {
        this.statusLabel = statusLabel;
    }
}
