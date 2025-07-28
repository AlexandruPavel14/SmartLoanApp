package com.alexandrupavel.smartloanappapi.controller.company;

import com.alexandrupavel.smartloanappapi.dto.loan.LoanApplicationAttachmentDTO;
import com.alexandrupavel.smartloanappapi.service.loan.LoanApplicationAttachmentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/loan-attachments")
public class LoanApplicationAttachmentController {

    private final LoanApplicationAttachmentService service;

    public LoanApplicationAttachmentController(LoanApplicationAttachmentService service) {
        this.service = service;
    }

    @PostMapping
    public LoanApplicationAttachmentDTO create(@RequestBody LoanApplicationAttachmentDTO dto) {
        return service.create(dto);
    }

    @GetMapping
    public List<LoanApplicationAttachmentDTO> list() {
        return service.findAll();
    }
}
