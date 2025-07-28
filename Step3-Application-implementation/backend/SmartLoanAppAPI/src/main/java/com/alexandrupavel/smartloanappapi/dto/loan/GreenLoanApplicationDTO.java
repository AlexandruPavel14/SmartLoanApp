package com.alexandrupavel.smartloanappapi.dto.loan;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class GreenLoanApplicationDTO {

    private Long id;
    private String projectTitle;
    private String projectDescription;
    private BigDecimal requestedAmount;
    private Double esgScore;
    private boolean isPublishedInMarketPlace;
    private LocalDateTime submittedAt;

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
