package com.alexandrupavel.smartloanappapi.dto.marketplace;

import java.time.LocalDateTime;

public class MarketplaceListingDTO {

    private Long id;
    private Long loanApplicationId;
    private LocalDateTime datePublished;
    private String approvedBy;
    private boolean isActive;

    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public Long getLoanApplicationId() { return loanApplicationId; }

    public void setLoanApplicationId(Long loanApplicationId) { this.loanApplicationId = loanApplicationId; }

    public LocalDateTime getDatePublished() { return datePublished; }

    public void setDatePublished(LocalDateTime datePublished) { this.datePublished = datePublished; }

    public String getApprovedBy() { return approvedBy; }

    public void setApprovedBy(String approvedBy) { this.approvedBy = approvedBy; }

    public boolean isActive() { return isActive; }

    public void setActive(boolean active) { isActive = active; }
}
