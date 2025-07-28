package com.alexandrupavel.smartloanappapi.dto.loan;

import java.time.LocalDateTime;

public class LoanReviewDTO {

    private Long id;
    private String reviewerName;
    private String comments;
    private Integer rating;
    private LocalDateTime reviewedAt;
    private Long loanApplicationId;

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

    public Long getLoanApplicationId() { return loanApplicationId; }

    public void setLoanApplicationId(Long loanApplicationId) { this.loanApplicationId = loanApplicationId; }
}
