package com.alexandrupavel.smartloanappapi.service.marketplace;

import com.alexandrupavel.smartloanappapi.dto.marketplace.MarketplaceListingDTO;
import com.alexandrupavel.smartloanappapi.model.loan.GreenLoanApplication;
import com.alexandrupavel.smartloanappapi.model.marketplace.MarketplaceListing;
import com.alexandrupavel.smartloanappapi.repository.loan.GreenLoanApplicationRepository;
import com.alexandrupavel.smartloanappapi.repository.marketplace.MarketplaceListingRepository;
import com.alexandrupavel.smartloanappapi.util.marketplace.MarketplaceListingMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MarketplaceListingService {

    private final MarketplaceListingRepository repository;
    private final GreenLoanApplicationRepository loanAppRepo;

    public MarketplaceListingService(MarketplaceListingRepository repository,
                                     GreenLoanApplicationRepository loanAppRepo) {
        this.repository = repository;
        this.loanAppRepo = loanAppRepo;
    }

    public MarketplaceListingDTO create(MarketplaceListingDTO dto) {
        GreenLoanApplication loanApplication = loanAppRepo.findById(dto.getLoanApplicationId())
                .orElseThrow(() -> new IllegalArgumentException("Loan Application not found"));
        MarketplaceListing entity = MarketplaceListingMapper.toEntity(dto, loanApplication);
        return MarketplaceListingMapper.toDTO(repository.save(entity));
    }

    public List<MarketplaceListingDTO> findAll() {
        return repository.findAll()
                .stream()
                .map(MarketplaceListingMapper::toDTO)
                .collect(Collectors.toList());
    }
}
