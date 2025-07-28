package com.alexandrupavel.smartloanappapi.dto.income;

public class IncomeBracketDTO {

    private Long id;
    private String incomeOverview;

    public IncomeBracketDTO() {}

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
