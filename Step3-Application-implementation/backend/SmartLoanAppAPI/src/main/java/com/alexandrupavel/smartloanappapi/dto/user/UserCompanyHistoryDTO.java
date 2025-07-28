package com.alexandrupavel.smartloanappapi.dto.user;

import java.time.LocalDate;

public class UserCompanyHistoryDTO {
    private Long historyId;
    private Long userId;
    private Long companyId;
    private Long roleInCompanyId;
    private LocalDate declaredAt;
    private boolean isCurrent;

    // Getters & Setters
    public Long getHistoryId() {
        return historyId;
    }

    public void setHistoryId(Long historyId) {
        this.historyId = historyId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public Long getRoleInCompanyId() {
        return roleInCompanyId;
    }

    public void setRoleInCompanyId(Long roleInCompanyId) {
        this.roleInCompanyId = roleInCompanyId;
    }

    public LocalDate getDeclaredAt() {
        return declaredAt;
    }

    public void setDeclaredAt(LocalDate declaredAt) {
        this.declaredAt = declaredAt;
    }

    public boolean isCurrent() {
        return isCurrent;
    }

    public void setCurrent(boolean current) {
        isCurrent = current;
    }
}
