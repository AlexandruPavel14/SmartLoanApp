//package com.alexandrupavel.smartloanappapi.model;
//
//import jakarta.persistence.*;
//import java.math.BigDecimal;
//import java.time.LocalDate;
//
//@Entity
//@Table(name = "loans")
//public class Loan {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)   // AUTOINCREMENT in SQLite
//    private Long id;
//
//    private BigDecimal amount;
//    private LocalDate  startDate;
//    private Integer    termMonths;
//
//    // getters & setters …
//}

package com.alexandrupavel.smartloanappapi.model;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "loans")
public class Loan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)   // AUTOINCREMENT in SQLite
    private Long id;

    private BigDecimal amount;
    private LocalDate startDate;
    private Integer termMonths;

    // No-args constructor (required by JPA)
    public Loan() {
    }

    // All-args constructor (except id, which is auto-generated)
    public Loan(Long id, BigDecimal amount, LocalDate startDate, Integer termMonths) {
        this.id = id;
        this.amount = amount;
        this.startDate = startDate;
        this.termMonths = termMonths;
    }

    // Getters & setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public Integer getTermMonths() {
        return termMonths;
    }

    public void setTermMonths(Integer termMonths) {
        this.termMonths = termMonths;
    }
}
