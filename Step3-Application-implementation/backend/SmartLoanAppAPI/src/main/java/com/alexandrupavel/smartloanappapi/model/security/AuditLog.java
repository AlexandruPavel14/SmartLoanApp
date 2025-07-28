package com.alexandrupavel.smartloanappapi.model.security;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "audit_logs")
public class AuditLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String actionType;

    private String entityName;

    private String performedBy;

    private LocalDateTime timestamp;

    @Column(length = 1000)
    private String details;

    public AuditLog() {}

    public AuditLog(Long id, String actionType, String entityName, String performedBy, LocalDateTime timestamp, String details) {
        this.id = id;
        this.actionType = actionType;
        this.entityName = entityName;
        this.performedBy = performedBy;
        this.timestamp = timestamp;
        this.details = details;
    }

    @PrePersist
    protected void onCreate() {
        this.timestamp = LocalDateTime.now();
    }

    // Getters & Setters
    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public String getActionType() { return actionType; }

    public void setActionType(String actionType) { this.actionType = actionType; }

    public String getEntityName() { return entityName; }

    public void setEntityName(String entityName) { this.entityName = entityName; }

    public String getPerformedBy() { return performedBy; }

    public void setPerformedBy(String performedBy) { this.performedBy = performedBy; }

    public LocalDateTime getTimestamp() { return timestamp; }

    public void setTimestamp(LocalDateTime timestamp) { this.timestamp = timestamp; }

    public String getDetails() { return details; }

    public void setDetails(String details) { this.details = details; }
}
