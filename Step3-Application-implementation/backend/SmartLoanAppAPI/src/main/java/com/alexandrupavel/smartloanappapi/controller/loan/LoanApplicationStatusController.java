package com.alexandrupavel.smartloanappapi.controller.loan;

import com.alexandrupavel.smartloanappapi.dto.loan.LoanApplicationStatusDTO;
import com.alexandrupavel.smartloanappapi.service.loan.LoanApplicationStatusService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/loan-statuses")
public class LoanApplicationStatusController {

    private final LoanApplicationStatusService service;

    public LoanApplicationStatusController(LoanApplicationStatusService service) {
        this.service = service;
    }

    @PostMapping
    public LoanApplicationStatusDTO create(@RequestBody LoanApplicationStatusDTO dto) {
        return service.create(dto);
    }

    @GetMapping
    public List<LoanApplicationStatusDTO> getAll() {
        return service.findAll();
    }
}
