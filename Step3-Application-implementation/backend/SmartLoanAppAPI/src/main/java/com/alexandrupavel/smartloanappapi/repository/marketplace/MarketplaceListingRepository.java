package com.alexandrupavel.smartloanappapi.repository.marketplace;

import com.alexandrupavel.smartloanappapi.model.marketplace.MarketplaceListing;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MarketplaceListingRepository extends JpaRepository<MarketplaceListing, Long> {
}
