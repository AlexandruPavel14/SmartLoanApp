package com.alexandrupavel.smartloanappapi.controller.marketplace;

import com.alexandrupavel.smartloanappapi.dto.marketplace.MarketplaceListingDTO;
import com.alexandrupavel.smartloanappapi.service.marketplace.MarketplaceListingService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/marketplace")
public class MarketplaceListingController {

    private final MarketplaceListingService service;

    public MarketplaceListingController(MarketplaceListingService service) {
        this.service = service;
    }

    @PostMapping
    public MarketplaceListingDTO create(@RequestBody MarketplaceListingDTO dto) {
        return service.create(dto);
    }

    @GetMapping
    public List<MarketplaceListingDTO> list() {
        return service.findAll();
    }
}
