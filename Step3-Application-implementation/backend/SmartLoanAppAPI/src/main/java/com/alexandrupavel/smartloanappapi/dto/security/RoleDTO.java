package com.alexandrupavel.smartloanappapi.dto.security;

public class RoleDTO {
    private Long roleId;
    private String roleName;

    // Getters & setters
    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
}
