package com.alexandrupavel.smartloanappapi.controller.loan;

import com.alexandrupavel.smartloanappapi.dto.loan.LoanReviewDTO;
import com.alexandrupavel.smartloanappapi.service.loan.LoanReviewService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/loan-reviews")
public class LoanReviewController {

    private final LoanReviewService service;

    public LoanReviewController(LoanReviewService service) {
        this.service = service;
    }

    @PostMapping
    public LoanReviewDTO create(@RequestBody LoanReviewDTO dto) {
        return service.create(dto);
    }

    @GetMapping
    public List<LoanReviewDTO> list() {
        return service.findAll();
    }
}
