package com.alexandrupavel.smartloanappapi.controller.loan;

import com.alexandrupavel.smartloanappapi.dto.loan.LoanDTO;
import com.alexandrupavel.smartloanappapi.service.loan.LoanService;
import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/loans")
public class LoanController {

    private final LoanService service;

    public LoanController(LoanService service) {
        this.service = service;
    }

    @PostConstruct
    public void init() {
        service.insertMockData();
    }

    @PostMapping
    public LoanDTO create(@RequestBody LoanDTO dto) {
        return service.createLoan(dto);
    }

    @GetMapping
    public List<LoanDTO> list() {
        return service.getAllLoans();
    }
}
