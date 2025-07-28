package com.alexandrupavel.smartloanappapi.util.marketplace;

import com.alexandrupavel.smartloanappapi.dto.marketplace.MarketplaceListingDTO;
import com.alexandrupavel.smartloanappapi.model.loan.GreenLoanApplication;
import com.alexandrupavel.smartloanappapi.model.marketplace.MarketplaceListing;

public class MarketplaceListingMapper {

    public static MarketplaceListing toEntity(MarketplaceListingDTO dto, GreenLoanApplication loanApplication) {
        return new MarketplaceListing(
                dto.getId(),
                loanApplication,
                dto.getDatePublished(),
                dto.getApprovedBy(),
                dto.isActive()
        );
    }

    public static MarketplaceListingDTO toDTO(MarketplaceListing entity) {
        MarketplaceListingDTO dto = new MarketplaceListingDTO();
        dto.setId(entity.getId());
        dto.setLoanApplicationId(entity.getLoanApplication().getId());
        dto.setDatePublished(entity.getDatePublished());
        dto.setApprovedBy(entity.getApprovedBy());
        dto.setActive(entity.isActive());
        return dto;
    }
}
