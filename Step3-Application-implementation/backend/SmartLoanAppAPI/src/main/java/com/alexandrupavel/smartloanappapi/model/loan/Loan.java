package com.alexandrupavel.smartloanappapi.model.loan;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "loans")
public class Loan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private BigDecimal amount;
    private LocalDate startDate;
    private Integer termMonths;

    public Loan() {}

    public Loan(Long id, BigDecimal amount, LocalDate startDate, Integer termMonths) {
        this.id = id;
        this.amount = amount;
        this.startDate = startDate;
        this.termMonths = termMonths;
    }

    public Long getId() {
        return id;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public Integer getTermMonths() {
        return termMonths;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public void setTermMonths(Integer termMonths) {
        this.termMonths = termMonths;
    }
}
