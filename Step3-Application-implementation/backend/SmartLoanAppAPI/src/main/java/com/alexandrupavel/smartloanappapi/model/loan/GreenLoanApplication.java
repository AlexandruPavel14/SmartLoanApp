package com.alexandrupavel.smartloanappapi.model.loan;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "green_loan_applications")
public class GreenLoanApplication {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String projectTitle;
    private String projectDescription;
    private BigDecimal requestedAmount;
    private Double esgScore;
    private boolean isPublishedInMarketPlace;
    private LocalDateTime submittedAt;

    public GreenLoanApplication() {}

    public GreenLoanApplication(Long id, String projectTitle, String projectDescription,
                                BigDecimal requestedAmount, Double esgScore,
                                boolean isPublishedInMarketPlace, LocalDateTime submittedAt) {
        this.id = id;
        this.projectTitle = projectTitle;
        this.projectDescription = projectDescription;
        this.requestedAmount = requestedAmount;
        this.esgScore = esgScore;
        this.isPublishedInMarketPlace = isPublishedInMarketPlace;
        this.submittedAt = submittedAt;
    }

    @PrePersist
    protected void onCreate() {
        this.submittedAt = LocalDateTime.now();
    }

    // Getters & Setters
    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public String getProjectTitle() { return projectTitle; }

    public void setProjectTitle(String projectTitle) { this.projectTitle = projectTitle; }

    public String getProjectDescription() { return projectDescription; }

    public void setProjectDescription(String projectDescription) { this.projectDescription = projectDescription; }

    public BigDecimal getRequestedAmount() { return requestedAmount; }

    public void setRequestedAmount(BigDecimal requestedAmount) { this.requestedAmount = requestedAmount; }

    public Double getEsgScore() { return esgScore; }

    public void setEsgScore(Double esgScore) { this.esgScore = esgScore; }

    public boolean isPublishedInMarketPlace() { return isPublishedInMarketPlace; }

    public void setPublishedInMarketPlace(boolean publishedInMarketPlace) { isPublishedInMarketPlace = publishedInMarketPlace; }

    public LocalDateTime getSubmittedAt() { return submittedAt; }

    public void setSubmittedAt(LocalDateTime submittedAt) { this.submittedAt = submittedAt; }
}
