package com.alexandrupavel.smartloanappapi.controller.income;

import com.alexandrupavel.smartloanappapi.dto.income.PastIncomeDTO;
import com.alexandrupavel.smartloanappapi.service.income.PastIncomeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/past-incomes")
public class PastIncomeController {

    private final PastIncomeService pastIncomeService;

    public PastIncomeController(PastIncomeService pastIncomeService) {
        this.pastIncomeService = pastIncomeService;
    }

    @PostMapping
    public PastIncomeDTO create(@RequestBody PastIncomeDTO dto) {
        return pastIncomeService.create(dto);
    }

    @GetMapping
    public List<PastIncomeDTO> listAll() {
        return pastIncomeService.findAll();
    }
}
