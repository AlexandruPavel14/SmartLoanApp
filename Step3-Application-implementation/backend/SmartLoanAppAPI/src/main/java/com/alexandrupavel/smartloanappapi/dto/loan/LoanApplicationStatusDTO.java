package com.alexandrupavel.smartloanappapi.dto.loan;

public class LoanApplicationStatusDTO {
    private Long id;
    private String statusLabel;

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
