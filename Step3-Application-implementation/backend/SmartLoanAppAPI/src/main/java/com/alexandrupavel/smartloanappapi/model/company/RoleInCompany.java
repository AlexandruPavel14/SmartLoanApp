package com.alexandrupavel.smartloanappapi.model.company;

import jakarta.persistence.*;

@Entity
@Table(name = "roles_in_company")
public class RoleInCompany {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long roleInCompanyId;

    @Column(nullable = false, unique = true)
    private String roleName;

    private String description;

    public RoleInCompany() {}

    public RoleInCompany(Long roleInCompanyId, String roleName, String description) {
        this.roleInCompanyId = roleInCompanyId;
        this.roleName = roleName;
        this.description = description;
    }

    public Long getRoleInCompanyId() {
        return roleInCompanyId;
    }

    public void setRoleInCompanyId(Long roleInCompanyId) {
        this.roleInCompanyId = roleInCompanyId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
