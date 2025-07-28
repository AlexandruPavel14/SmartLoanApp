package com.alexandrupavel.smartloanappapi.model.loan;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "loan_reviews")
public class LoanReview {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String reviewerName;

    @Column(length = 1000)
    private String comments;

    private Integer rating;

    private LocalDateTime reviewedAt;

    @ManyToOne
    @JoinColumn(name = "loan_application_id", nullable = false)
    private GreenLoanApplication loanApplication;

    public LoanReview() {}

    public LoanReview(Long id, String reviewerName, String comments,
                      Integer rating, LocalDateTime reviewedAt,
                      GreenLoanApplication loanApplication) {
        this.id = id;
        this.reviewerName = reviewerName;
        this.comments = comments;
        this.rating = rating;
        this.reviewedAt = reviewedAt;
        this.loanApplication = loanApplication;
    }

    @PrePersist
    protected void onCreate() {
        this.reviewedAt = LocalDateTime.now();
    }

    // Getters and setters
    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public String getReviewerName() { return reviewerName; }

    public void setReviewerName(String reviewerName) { this.reviewerName = reviewerName; }

    public String getComments() { return comments; }

    public void setComments(String comments) { this.comments = comments; }

    public Integer getRating() { return rating; }

    public void setRating(Integer rating) { this.rating = rating; }

    public LocalDateTime getReviewedAt() { return reviewedAt; }

    public void setReviewedAt(LocalDateTime reviewedAt) { this.reviewedAt = reviewedAt; }

    public GreenLoanApplication getLoanApplication() { return loanApplication; }

    public void setLoanApplication(GreenLoanApplication loanApplication) {
        this.loanApplication = loanApplication;
    }
}
