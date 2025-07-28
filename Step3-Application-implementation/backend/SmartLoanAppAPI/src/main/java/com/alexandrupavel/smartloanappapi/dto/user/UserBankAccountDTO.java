package com.alexandrupavel.smartloanappapi.dto.user;

public class UserBankAccountDTO {
    private Long userBankAccountId;
    private Long userId;
    private String iban;
    private Long bankId;
    private Long currencyId;
    private Boolean isPreferred;

    // Getters & Setters
    public Long getUserBankAccountId() {
        return userBankAccountId;
    }

    public void setUserBankAccountId(Long userBankAccountId) {
        this.userBankAccountId = userBankAccountId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public Long getBankId() {
        return bankId;
    }

    public void setBankId(Long bankId) {
        this.bankId = bankId;
    }

    public Long getCurrencyId() {
        return currencyId;
    }

    public void setCurrencyId(Long currencyId) {
        this.currencyId = currencyId;
    }

    public Boolean getIsPreferred() {
        return isPreferred;
    }

    public void setIsPreferred(Boolean preferred) {
        isPreferred = preferred;
    }
}
