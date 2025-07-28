package com.alexandrupavel.smartloanappapi.dto.user;

import java.time.LocalDateTime;

public class UserActivityLogDTO {

    private Long id;
    private Long userId;
    private String activityType;
    private String description;
    private LocalDateTime timestamp;

    // Getters & Setters
    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public Long getUserId() { return userId; }

    public void setUserId(Long userId) { this.userId = userId; }

    public String getActivityType() { return activityType; }

    public void setActivityType(String activityType) { this.activityType = activityType; }

    public String getDescription() { return description; }

    public void setDescription(String description) { this.description = description; }

    public LocalDateTime getTimestamp() { return timestamp; }

    public void setTimestamp(LocalDateTime timestamp) { this.timestamp = timestamp; }
}
