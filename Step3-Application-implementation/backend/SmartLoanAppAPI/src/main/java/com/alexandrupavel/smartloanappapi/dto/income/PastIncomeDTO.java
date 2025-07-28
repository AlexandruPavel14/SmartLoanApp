package com.alexandrupavel.smartloanappapi.dto.income;

import java.math.BigDecimal;
import java.time.LocalDate;

public class PastIncomeDTO {

    private Long id;
    private Long userId;
    private Long incomeBracketId;
    private Long currencyId;
    private BigDecimal exactAmount;
    private LocalDate recordedAt;

    public PastIncomeDTO() {}

    public Long getId() {
        return id;
    }

    public Long getUserId() {
        return userId;
    }

    public Long getIncomeBracketId() {
        return incomeBracketId;
    }

    public Long getCurrencyId() {
        return currencyId;
    }

    public BigDecimal getExactAmount() {
        return exactAmount;
    }

    public LocalDate getRecordedAt() {
        return recordedAt;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public void setIncomeBracketId(Long incomeBracketId) {
        this.incomeBracketId = incomeBracketId;
    }

    public void setCurrencyId(Long currencyId) {
        this.currencyId = currencyId;
    }

    public void setExactAmount(BigDecimal exactAmount) {
        this.exactAmount = exactAmount;
    }

    public void setRecordedAt(LocalDate recordedAt) {
        this.recordedAt = recordedAt;
    }
}
