package com.alexandrupavel.smartloanappapi.model.user;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "user_activity_logs")
public class UserActivityLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long userId;

    private String activityType;

    private String description;

    private LocalDateTime timestamp;

    public UserActivityLog() {}

    public UserActivityLog(Long id, Long userId, String activityType, String description, LocalDateTime timestamp) {
        this.id = id;
        this.userId = userId;
        this.activityType = activityType;
        this.description = description;
        this.timestamp = timestamp;
    }

    @PrePersist
    protected void onCreate() {
        this.timestamp = LocalDateTime.now();
    }

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
