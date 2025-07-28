package com.alexandrupavel.smartloanappapi.model.loan;

import com.alexandrupavel.smartloanappapi.model.user.User;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "loan_messages")
public class LoanMessage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String content;

    private LocalDateTime sentAt;

    @ManyToOne
    @JoinColumn(name = "thread_id", nullable = false)
    private LoanMessageThread thread;

    @ManyToOne
    @JoinColumn(name = "sender_user_id", nullable = false)
    private User sender;

    public LoanMessage() {}

    public LoanMessage(Long id, String content, LocalDateTime sentAt, LoanMessageThread thread, User sender) {
        this.id = id;
        this.content = content;
        this.sentAt = sentAt;
        this.thread = thread;
        this.sender = sender;
    }

    @PrePersist
    protected void onCreate() {
        this.sentAt = LocalDateTime.now();
    }

    // Getters & Setters
    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public String getContent() { return content; }

    public void setContent(String content) { this.content = content; }

    public LocalDateTime getSentAt() { return sentAt; }

    public void setSentAt(LocalDateTime sentAt) { this.sentAt = sentAt; }

    public LoanMessageThread getThread() { return thread; }

    public void setThread(LoanMessageThread thread) { this.thread = thread; }

    public User getSender() { return sender; }

    public void setSender(User sender) { this.sender = sender; }
}
