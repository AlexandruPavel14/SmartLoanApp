package com.alexandrupavel.smartloanappapi.model.income;

import jakarta.persistence.*;

@Entity
@Table(name = "income_brackets")
public class IncomeBracket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "income_overview", nullable = false)
    private String incomeOverview;

    public IncomeBracket() {}

    public IncomeBracket(Long id, String incomeOverview) {
        this.id = id;
        this.incomeOverview = incomeOverview;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIncomeOverview() {
        return incomeOverview;
    }

    public void setIncomeOverview(String incomeOverview) {
        this.incomeOverview = incomeOverview;
    }
}
