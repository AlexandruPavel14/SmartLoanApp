package com.alexandrupavel.smartloanappapi.controller.file;

import com.alexandrupavel.smartloanappapi.dto.file.SpecificBasePathDTO;
import com.alexandrupavel.smartloanappapi.service.file.SpecificBasePathService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/specific-base-paths")
public class SpecificBasePathController {

    private final SpecificBasePathService service;

    public SpecificBasePathController(SpecificBasePathService service) {
        this.service = service;
    }

    @PostMapping
    public SpecificBasePathDTO create(@RequestBody SpecificBasePathDTO dto) {
        return service.create(dto);
    }

    @GetMapping
    public List<SpecificBasePathDTO> getAll() {
        return service.findAll();
    }
}
