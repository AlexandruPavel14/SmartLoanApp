package com.alexandrupavel.smartloanappapi.controller.company;

import com.alexandrupavel.smartloanappapi.dto.company.CompanyLegalPrefixDTO;
import com.alexandrupavel.smartloanappapi.service.company.CompanyLegalPrefixService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/company-legal-prefixes")
public class CompanyLegalPrefixController {

    private final CompanyLegalPrefixService service;

    public CompanyLegalPrefixController(CompanyLegalPrefixService service) {
        this.service = service;
    }

    @PostMapping
    public CompanyLegalPrefixDTO create(@RequestBody CompanyLegalPrefixDTO dto) {
        return service.create(dto);
    }

    @GetMapping
    public List<CompanyLegalPrefixDTO> list() {
        return service.findAll();
    }
}
