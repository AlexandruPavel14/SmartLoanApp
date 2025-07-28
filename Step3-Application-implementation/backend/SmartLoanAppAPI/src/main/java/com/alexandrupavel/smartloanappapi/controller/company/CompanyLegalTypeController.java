package com.alexandrupavel.smartloanappapi.controller.company;

import com.alexandrupavel.smartloanappapi.dto.company.CompanyLegalTypeDTO;
import com.alexandrupavel.smartloanappapi.service.company.CompanyLegalTypeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/company-legal-types")
public class CompanyLegalTypeController {

    private final CompanyLegalTypeService service;

    public CompanyLegalTypeController(CompanyLegalTypeService service) {
        this.service = service;
    }

    @PostMapping
    public CompanyLegalTypeDTO create(@RequestBody CompanyLegalTypeDTO dto) {
        return service.create(dto);
    }

    @GetMapping
    public List<CompanyLegalTypeDTO> list() {
        return service.findAll();
    }
}
