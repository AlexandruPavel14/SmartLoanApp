package com.alexandrupavel.smartloanappapi.dto.security;

import java.time.LocalDateTime;

public class AuditLogDTO {

    private Long id;
    private String actionType;
    private String entityName;
    private String performedBy;
    private LocalDateTime timestamp;
    private String details;

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
