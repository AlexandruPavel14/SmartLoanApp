package com.alexandrupavel.smartloanappapi.controller.loan;

import com.alexandrupavel.smartloanappapi.dto.loan.GreenLoanApplicationDTO;
import com.alexandrupavel.smartloanappapi.service.loan.GreenLoanApplicationService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/green-loans")
public class GreenLoanApplicationController {

    private final GreenLoanApplicationService service;

    public GreenLoanApplicationController(GreenLoanApplicationService service) {
        this.service = service;
    }

    @PostMapping
    public GreenLoanApplicationDTO create(@RequestBody GreenLoanApplicationDTO dto) {
        return service.create(dto);
    }

    @GetMapping
    public List<GreenLoanApplicationDTO> list() {
        return service.findAll();
    }
}
