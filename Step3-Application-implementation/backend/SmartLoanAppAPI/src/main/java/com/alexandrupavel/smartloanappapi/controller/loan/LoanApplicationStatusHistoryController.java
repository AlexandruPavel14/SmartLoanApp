package com.alexandrupavel.smartloanappapi.controller.loan;

import com.alexandrupavel.smartloanappapi.dto.loan.LoanApplicationStatusHistoryDTO;
import com.alexandrupavel.smartloanappapi.service.loan.LoanApplicationStatusHistoryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/status-history")
public class LoanApplicationStatusHistoryController {

    private final LoanApplicationStatusHistoryService service;

    public LoanApplicationStatusHistoryController(LoanApplicationStatusHistoryService service) {
        this.service = service;
    }

    @PostMapping
    public LoanApplicationStatusHistoryDTO create(@RequestBody LoanApplicationStatusHistoryDTO dto) {
        return service.create(dto);
    }

    @GetMapping
    public List<LoanApplicationStatusHistoryDTO> list() {
        return service.findAll();
    }
}
