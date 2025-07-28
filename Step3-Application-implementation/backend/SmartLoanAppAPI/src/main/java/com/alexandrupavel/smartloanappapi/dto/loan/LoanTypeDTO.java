package com.alexandrupavel.smartloanappapi.dto.loan;

public class LoanTypeDTO {

    private Long loanTypeId;
    private String loanName;
    private String description;

    // Getters & Setters
    public Long getLoanTypeId() {
        return loanTypeId;
    }

    public void setLoanTypeId(Long loanTypeId) {
        this.loanTypeId = loanTypeId;
    }

    public String getLoanName() {
        return loanName;
    }

    public void setLoanName(String loanName) {
        this.loanName = loanName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
