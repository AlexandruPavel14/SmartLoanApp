package com.alexandrupavel.smartloanappapi.controller.geo;

import com.alexandrupavel.smartloanappapi.dto.geo.CityDTO;
import com.alexandrupavel.smartloanappapi.service.geo.CityService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cities")
public class CityController {

    private final CityService service;

    public CityController(CityService service) {
        this.service = service;
    }

    @PostMapping
    public CityDTO create(@RequestBody CityDTO dto) {
        return service.create(dto);
    }

    @GetMapping
    public List<CityDTO> list() {
        return service.findAll();
    }
}
