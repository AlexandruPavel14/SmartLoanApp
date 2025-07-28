package com.alexandrupavel.smartloanappapi.model.loan;

import jakarta.persistence.*;

@Entity
@Table(name = "loan_types")
public class LoanType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long loanTypeId;

    private String loanName;
    private String description;

    public LoanType() {}

    public LoanType(Long loanTypeId, String loanName, String description) {
        this.loanTypeId = loanTypeId;
        this.loanName = loanName;
        this.description = description;
    }

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
