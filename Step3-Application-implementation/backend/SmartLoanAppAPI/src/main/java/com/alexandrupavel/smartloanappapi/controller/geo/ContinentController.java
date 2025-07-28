package com.alexandrupavel.smartloanappapi.controller.geo;

import com.alexandrupavel.smartloanappapi.dto.geo.ContinentDTO;
import com.alexandrupavel.smartloanappapi.service.geo.ContinentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/continents")
public class ContinentController {

    private final ContinentService service;

    public ContinentController(ContinentService service) {
        this.service = service;
    }

    @PostMapping
    public ContinentDTO create(@RequestBody ContinentDTO dto) {
        return service.create(dto);
    }

    @GetMapping
    public List<ContinentDTO> list() {
        return service.findAll();
    }
}
