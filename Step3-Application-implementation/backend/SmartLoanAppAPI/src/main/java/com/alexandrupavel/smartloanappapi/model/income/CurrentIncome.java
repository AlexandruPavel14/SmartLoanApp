package com.alexandrupavel.smartloanappapi.model.income;

import com.alexandrupavel.smartloanappapi.model.bank.Currency;
import com.alexandrupavel.smartloanappapi.model.user.User;
import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "current_incomes")
public class CurrentIncome {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "income_bracket_id")
    private IncomeBracket incomeBracket;

    @ManyToOne(optional = false)
    @JoinColumn(name = "currency_id")
    private Currency currency;

    private BigDecimal exactAmount;

    private LocalDate recordedAt;

    public CurrentIncome() {}

    public CurrentIncome(Long id, User user, IncomeBracket incomeBracket, Currency currency, BigDecimal exactAmount, LocalDate recordedAt) {
        this.id = id;
        this.user = user;
        this.incomeBracket = incomeBracket;
        this.currency = currency;
        this.exactAmount = exactAmount;
        this.recordedAt = recordedAt;
    }

    // Getters & Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public IncomeBracket getIncomeBracket() {
        return incomeBracket;
    }

    public void setIncomeBracket(IncomeBracket incomeBracket) {
        this.incomeBracket = incomeBracket;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
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
