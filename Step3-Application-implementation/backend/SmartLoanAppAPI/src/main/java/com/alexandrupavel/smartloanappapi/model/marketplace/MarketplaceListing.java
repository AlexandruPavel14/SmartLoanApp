package com.alexandrupavel.smartloanappapi.model.marketplace;

import com.alexandrupavel.smartloanappapi.model.loan.GreenLoanApplication;
import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "marketplace_listings")
public class MarketplaceListing {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "loan_application_id", nullable = false)
    private GreenLoanApplication loanApplication;

    private LocalDateTime datePublished;

    private String approvedBy;
    private boolean isActive;

    public MarketplaceListing() {}

    public MarketplaceListing(Long id, GreenLoanApplication loanApplication,
                              LocalDateTime datePublished, String approvedBy, boolean isActive) {
        this.id = id;
        this.loanApplication = loanApplication;
        this.datePublished = datePublished;
        this.approvedBy = approvedBy;
        this.isActive = isActive;
    }

    // Getters & setters
    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public GreenLoanApplication getLoanApplication() { return loanApplication; }

    public void setLoanApplication(GreenLoanApplication loanApplication) { this.loanApplication = loanApplication; }

    public LocalDateTime getDatePublished() { return datePublished; }

    public void setDatePublished(LocalDateTime datePublished) { this.datePublished = datePublished; }

    public String getApprovedBy() { return approvedBy; }

    public void setApprovedBy(String approvedBy) { this.approvedBy = approvedBy; }

    public boolean isActive() { return isActive; }

    public void setActive(boolean active) { isActive = active; }
}
