package com.alexandrupavel.smartloanappapi.controller.geo;

import com.alexandrupavel.smartloanappapi.dto.geo.CountryCityDTO;
import com.alexandrupavel.smartloanappapi.service.geo.CountryCityService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/country-city")
public class CountryCityController {

    private final CountryCityService service;

    public CountryCityController(CountryCityService service) {
        this.service = service;
    }

    @PostMapping
    public CountryCityDTO create(@RequestBody CountryCityDTO dto) {
        return service.create(dto);
    }

    @GetMapping
    public List<CountryCityDTO> list() {
        return service.findAll();
    }
}
