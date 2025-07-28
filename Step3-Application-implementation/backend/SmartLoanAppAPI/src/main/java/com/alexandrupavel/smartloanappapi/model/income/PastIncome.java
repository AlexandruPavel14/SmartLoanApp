package com.alexandrupavel.smartloanappapi.model.income;

import com.alexandrupavel.smartloanappapi.model.bank.Currency;
import com.alexandrupavel.smartloanappapi.model.user.User;
import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "past_incomes")
public class PastIncome {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne(optional = false)
    @JoinColumn(name = "income_bracket_id")
    private IncomeBracket incomeBracket;

    @ManyToOne(optional = false)
    @JoinColumn(name = "currency_id")
    private Currency currency;

    @Column(name = "exact_amount", nullable = false)
    private BigDecimal exactAmount;

    @Column(name = "recorded_at", nullable = false)
    private LocalDate recordedAt;

    public PastIncome() {
    }

    public PastIncome(Long id, User user, IncomeBracket incomeBracket, Currency currency, BigDecimal exactAmount, LocalDate recordedAt) {
        this.id = id;
        this.user = user;
        this.incomeBracket = incomeBracket;
        this.currency = currency;
        this.exactAmount = exactAmount;
        this.recordedAt = recordedAt;
    }

    public Long getId() {
        return id;
    }

    public User getUser() {
        return user;
    }

    public IncomeBracket getIncomeBracket() {
        return incomeBracket;
    }

    public Currency getCurrency() {
        return currency;
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

    public void setUser(User user) {
        this.user = user;
    }

    public void setIncomeBracket(IncomeBracket incomeBracket) {
        this.incomeBracket = incomeBracket;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public void setExactAmount(BigDecimal exactAmount) {
        this.exactAmount = exactAmount;
    }

    public void setRecordedAt(LocalDate recordedAt) {
        this.recordedAt = recordedAt;
    }
}
