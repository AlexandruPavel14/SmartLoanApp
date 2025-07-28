package com.alexandrupavel.smartloanappapi.controller.income;

import com.alexandrupavel.smartloanappapi.dto.income.IncomeBracketDTO;
import com.alexandrupavel.smartloanappapi.service.income.IncomeBracketService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/income-brackets")
public class IncomeBracketController {

    private final IncomeBracketService service;

    public IncomeBracketController(IncomeBracketService service) {
        this.service = service;
    }

    @PostMapping
    public IncomeBracketDTO create(@RequestBody IncomeBracketDTO dto) {
        return service.create(dto);
    }

    @GetMapping
    public List<IncomeBracketDTO> findAll() {
        return service.findAll();
    }
}
