package com.alexandrupavel.smartloanappapi.controller.geo;

import com.alexandrupavel.smartloanappapi.dto.geo.CountryDTO;
import com.alexandrupavel.smartloanappapi.service.geo.CountryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/countries")
public class CountryController {

    private final CountryService service;

    public CountryController(CountryService service) {
        this.service = service;
    }

    @PostMapping
    public CountryDTO create(@RequestBody CountryDTO dto) {
        return service.create(dto);
    }

    @GetMapping
    public List<CountryDTO> list() {
        return service.findAll();
    }
}
