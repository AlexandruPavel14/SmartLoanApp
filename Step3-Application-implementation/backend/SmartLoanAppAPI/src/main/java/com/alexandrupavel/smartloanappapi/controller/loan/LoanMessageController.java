package com.alexandrupavel.smartloanappapi.controller.loan;

import com.alexandrupavel.smartloanappapi.dto.loan.LoanMessageDTO;
import com.alexandrupavel.smartloanappapi.service.loan.LoanMessageService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/loan-messages")
public class LoanMessageController {

    private final LoanMessageService service;

    public LoanMessageController(LoanMessageService service) {
        this.service = service;
    }

    @PostMapping
    public LoanMessageDTO create(@RequestBody LoanMessageDTO dto) {
        return service.create(dto);
    }

    @GetMapping
    public List<LoanMessageDTO> list() {
        return service.findAll();
    }
}
