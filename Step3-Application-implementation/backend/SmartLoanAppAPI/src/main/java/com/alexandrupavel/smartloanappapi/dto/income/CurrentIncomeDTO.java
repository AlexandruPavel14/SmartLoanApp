package com.alexandrupavel.smartloanappapi.dto.income;

import java.math.BigDecimal;
import java.time.LocalDate;

public class CurrentIncomeDTO {

    private Long id;
    private Long userId;
    private Long incomeBracketId;
    private Long currencyId;
    private BigDecimal exactAmount;
    private LocalDate recordedAt;

    // Getters & Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getIncomeBracketId() {
        return incomeBracketId;
    }

    public void setIncomeBracketId(Long incomeBracketId) {
        this.incomeBracketId = incomeBracketId;
    }

    public Long getCurrencyId() {
        return currencyId;
    }

    public void setCurrencyId(Long currencyId) {
        this.currencyId = currencyId;
    }

    public BigDecimal getExactAmount() {
        return exactAmount;
    }

    public void setExactAmount(BigDecimal exactAmount) {
        this.exactAmount = exactAmount;
    }

    public LocalDate getRecordedAt() {
        return recordedAt;
    }

    public void setRecordedAt(LocalDate recordedAt) {
        this.recordedAt = recordedAt;
    }
}
