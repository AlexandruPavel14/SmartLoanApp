package com.alexandrupavel.smartloanappapi.dto.security;

public class EntitlementDTO {

    private Long id;
    private String actionName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getActionName() {
        return actionName;
    }

    public void setActionName(String actionName) {
        this.actionName = actionName;
    }
}
