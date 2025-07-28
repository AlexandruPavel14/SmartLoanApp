package com.alexandrupavel.smartloanappapi.controller.loan;

import com.alexandrupavel.smartloanappapi.dto.loan.LoanTypeDTO;
import com.alexandrupavel.smartloanappapi.service.loan.LoanTypeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/loan-types")
public class LoanTypeController {

    private final LoanTypeService service;

    public LoanTypeController(LoanTypeService service) {
        this.service = service;
    }

    @PostMapping
    public LoanTypeDTO create(@RequestBody LoanTypeDTO dto) {
        return service.create(dto);
    }

    @GetMapping
    public List<LoanTypeDTO> list() {
        return service.list();
    }
}
