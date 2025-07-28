package com.alexandrupavel.smartloanappapi.controller.bank;

import com.alexandrupavel.smartloanappapi.dto.bank.CurrencyDTO;
import com.alexandrupavel.smartloanappapi.service.bank.CurrencyService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/currencies")
public class CurrencyController {

    private final CurrencyService service;

    public CurrencyController(CurrencyService service) {
        this.service = service;
    }

    @PostMapping
    public CurrencyDTO create(@RequestBody CurrencyDTO dto) {
        return service.create(dto);
    }

    @GetMapping
    public List<CurrencyDTO> list() {
        return service.findAll();
    }
}
