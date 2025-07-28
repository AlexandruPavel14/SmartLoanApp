package com.alexandrupavel.smartloanappapi.controller.bank;

import com.alexandrupavel.smartloanappapi.dto.bank.RatingDTO;
import com.alexandrupavel.smartloanappapi.service.bank.RatingService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/ratings")
public class RatingController {

    private final RatingService service;

    public RatingController(RatingService service) {
        this.service = service;
    }

    @PostMapping
    public RatingDTO create(@RequestBody RatingDTO dto) {
        return service.create(dto);
    }

    @GetMapping
    public List<RatingDTO> getAll() {
        return service.findAll();
    }
}
