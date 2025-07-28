package com.alexandrupavel.smartloanappapi.controller.company;

import com.alexandrupavel.smartloanappapi.dto.company.CompanyDTO;
import com.alexandrupavel.smartloanappapi.service.company.CompanyService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/companies")
public class CompanyController {

    private final CompanyService service;

    public CompanyController(CompanyService service) {
        this.service = service;
    }

    @PostMapping
    public CompanyDTO create(@RequestBody CompanyDTO dto) {
        return service.create(dto);
    }

    @GetMapping
    public List<CompanyDTO> list() {
        return service.list();
    }
}
