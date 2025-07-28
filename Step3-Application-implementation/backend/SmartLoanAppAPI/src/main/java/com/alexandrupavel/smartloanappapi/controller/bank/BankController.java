package com.alexandrupavel.smartloanappapi.controller.bank;

import com.alexandrupavel.smartloanappapi.dto.bank.BankDTO;
import com.alexandrupavel.smartloanappapi.service.bank.BankService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/banks")
public class BankController {

    private final BankService service;

    public BankController(BankService service) {
        this.service = service;
    }

    @PostMapping
    public BankDTO create(@RequestBody BankDTO dto) {
        return service.create(dto);
    }

    @GetMapping
    public List<BankDTO> list() {
        return service.findAll();
    }
}
