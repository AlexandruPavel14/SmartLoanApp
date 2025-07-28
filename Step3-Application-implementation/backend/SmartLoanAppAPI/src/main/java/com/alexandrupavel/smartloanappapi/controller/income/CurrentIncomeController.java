package com.alexandrupavel.smartloanappapi.controller.income;

import com.alexandrupavel.smartloanappapi.dto.income.CurrentIncomeDTO;
import com.alexandrupavel.smartloanappapi.service.income.CurrentIncomeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/income/current")
public class CurrentIncomeController {

    private final CurrentIncomeService service;

    public CurrentIncomeController(CurrentIncomeService service) {
        this.service = service;
    }

    @PostMapping
    public CurrentIncomeDTO create(@RequestBody CurrentIncomeDTO dto) {
        return service.create(dto);
    }

    @GetMapping("/{userId}")
    public List<CurrentIncomeDTO> getAllByUser(@PathVariable Long userId) {
        return service.getAllByUserId(userId);
    }
}
