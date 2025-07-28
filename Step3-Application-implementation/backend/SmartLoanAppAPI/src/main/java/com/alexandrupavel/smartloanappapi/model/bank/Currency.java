package com.alexandrupavel.smartloanappapi.model.bank;

import jakarta.persistence.*;

@Entity
@Table(name = "currencies")
public class Currency {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long currencyId;

    private String currencyCode;
    private String currencySymbol;

    public Currency() {}

    public Currency(Long currencyId, String currencyCode, String currencySymbol) {
        this.currencyId = currencyId;
        this.currencyCode = currencyCode;
        this.currencySymbol = currencySymbol;
    }

    // Getters & setters
    public Long getCurrencyId() {
        return currencyId;
    }

    public void setCurrencyId(Long currencyId) {
        this.currencyId = currencyId;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public String getCurrencySymbol() {
        return currencySymbol;
    }

    public void setCurrencySymbol(String currencySymbol) {
        this.currencySymbol = currencySymbol;
    }
}
