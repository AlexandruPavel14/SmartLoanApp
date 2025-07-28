package com.alexandrupavel.smartloanappapi.controller.file;

import com.alexandrupavel.smartloanappapi.dto.file.ResourcePathDTO;
import com.alexandrupavel.smartloanappapi.service.file.ResourcePathService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/resource-paths")
public class ResourcePathController {

    private final ResourcePathService service;

    public ResourcePathController(ResourcePathService service) {
        this.service = service;
    }

    @PostMapping
    public ResourcePathDTO create(@RequestBody ResourcePathDTO dto) {
        return service.create(dto);
    }

    @GetMapping
    public List<ResourcePathDTO> getAll() {
        return service.findAll();
    }
}
