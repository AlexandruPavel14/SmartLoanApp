package com.alexandrupavel.smartloanappapi.dto.loan;

import java.time.LocalDateTime;

public class LoanMessageDTO {

    private Long id;
    private String content;
    private LocalDateTime sentAt;
    private Long threadId;
    private Long senderUserId;

    // Getters & Setters
    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public String getContent() { return content; }

    public void setContent(String content) { this.content = content; }

    public LocalDateTime getSentAt() { return sentAt; }

    public void setSentAt(LocalDateTime sentAt) { this.sentAt = sentAt; }

    public Long getThreadId() { return threadId; }

    public void setThreadId(Long threadId) { this.threadId = threadId; }

    public Long getSenderUserId() { return senderUserId; }

    public void setSenderUserId(Long senderUserId) { this.senderUserId = senderUserId; }
}
