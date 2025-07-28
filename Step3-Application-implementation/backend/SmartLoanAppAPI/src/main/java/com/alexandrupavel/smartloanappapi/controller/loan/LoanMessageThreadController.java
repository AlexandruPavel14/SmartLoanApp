package com.alexandrupavel.smartloanappapi.controller.loan;

import com.alexandrupavel.smartloanappapi.dto.loan.LoanMessageThreadDTO;
import com.alexandrupavel.smartloanappapi.service.loan.LoanMessageThreadService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/loan-message-threads")
public class LoanMessageThreadController {

    private final LoanMessageThreadService service;

    public LoanMessageThreadController(LoanMessageThreadService service) {
        this.service = service;
    }

    @PostMapping
    public LoanMessageThreadDTO create(@RequestBody LoanMessageThreadDTO dto) {
        return service.create(dto);
    }

    @GetMapping
    public List<LoanMessageThreadDTO> list() {
        return service.findAll();
    }
}
