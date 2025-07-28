package com.alexandrupavel.smartloanappapi.controller.loan;

import com.alexandrupavel.smartloanappapi.dto.loan.LoanRejectionReasonDTO;
import com.alexandrupavel.smartloanappapi.service.loan.LoanRejectionReasonService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/rejection-reasons")
public class LoanRejectionReasonController {

    private final LoanRejectionReasonService service;

    public LoanRejectionReasonController(LoanRejectionReasonService service) {
        this.service = service;
    }

    @PostMapping
    public LoanRejectionReasonDTO create(@RequestBody LoanRejectionReasonDTO dto) {
        return service.create(dto);
    }

    @GetMapping
    public List<LoanRejectionReasonDTO> list() {
        return service.findAll();
    }
}
