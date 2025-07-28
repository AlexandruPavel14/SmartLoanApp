package com.alexandrupavel.smartloanappapi.dto.company;

public class RoleInCompanyDTO {
    private Long roleInCompanyId;
    private String roleName;
    private String description;

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
