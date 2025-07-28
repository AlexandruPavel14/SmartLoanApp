package com.alexandrupavel.smartloanappapi.model.security;

import jakarta.persistence.*;

@Entity
@Table(name = "entitlements")
public class Entitlement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String actionName;

    public Entitlement() {}

    public Entitlement(Long id, String actionName) {
        this.id = id;
        this.actionName = actionName;
    }

    // Getters & setters
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
