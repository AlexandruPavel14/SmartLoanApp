package com.alexandrupavel.smartloanappapi.controller.geo;

import com.alexandrupavel.smartloanappapi.dto.geo.CountyDTO;
import com.alexandrupavel.smartloanappapi.service.geo.CountyService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/counties")
public class CountyController {

    private final CountyService service;

    public CountyController(CountyService service) {
        this.service = service;
    }

    @PostMapping
    public CountyDTO create(@RequestBody CountyDTO dto) {
        return service.create(dto);
    }

    @GetMapping
    public List<CountyDTO> list() {
        return service.findAll();
    }
}
