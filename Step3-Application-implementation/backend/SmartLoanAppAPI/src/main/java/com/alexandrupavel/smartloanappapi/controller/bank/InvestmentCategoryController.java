package com.alexandrupavel.smartloanappapi.controller.bank;

import com.alexandrupavel.smartloanappapi.dto.bank.InvestmentCategoryDTO;
import com.alexandrupavel.smartloanappapi.service.bank.InvestmentCategoryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/investment-categories")
public class InvestmentCategoryController {

    private final InvestmentCategoryService service;

    public InvestmentCategoryController(InvestmentCategoryService service) {
        this.service = service;
    }

    @PostMapping
    public InvestmentCategoryDTO create(@RequestBody InvestmentCategoryDTO dto) {
        return service.create(dto);
    }

    @GetMapping
    public List<InvestmentCategoryDTO> list() {
        return service.findAll();
    }
}
