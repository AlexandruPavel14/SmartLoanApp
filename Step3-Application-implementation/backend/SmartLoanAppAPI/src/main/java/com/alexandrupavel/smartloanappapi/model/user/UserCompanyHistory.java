package com.alexandrupavel.smartloanappapi.model.user;

import com.alexandrupavel.smartloanappapi.model.company.Company;
import com.alexandrupavel.smartloanappapi.model.company.RoleInCompany;
import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "user_company_history")
public class UserCompanyHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long historyId;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name = "company_id", nullable = false)
    private Company company;

    @ManyToOne
    @JoinColumn(name = "role_in_company_id", nullable = false)
    private RoleInCompany roleInCompany;

    private LocalDate declaredAt;
    private boolean isCurrent;

    public UserCompanyHistory() {}

    public UserCompanyHistory(Long historyId, User user, Company company, RoleInCompany roleInCompany,
                              LocalDate declaredAt, boolean isCurrent) {
        this.historyId = historyId;
        this.user = user;
        this.company = company;
        this.roleInCompany = roleInCompany;
        this.declaredAt = declaredAt;
        this.isCurrent = isCurrent;
    }

    // Getters & Setters
    public Long getHistoryId() {
        return historyId;
    }

    public void setHistoryId(Long historyId) {
        this.historyId = historyId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public RoleInCompany getRoleInCompany() {
        return roleInCompany;
    }

    public void setRoleInCompany(RoleInCompany roleInCompany) {
        this.roleInCompany = roleInCompany;
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
