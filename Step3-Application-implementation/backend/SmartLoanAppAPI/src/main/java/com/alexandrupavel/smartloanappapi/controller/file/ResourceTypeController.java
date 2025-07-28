package com.alexandrupavel.smartloanappapi.controller.file;

import com.alexandrupavel.smartloanappapi.dto.file.ResourceTypeDTO;
import com.alexandrupavel.smartloanappapi.service.file.ResourceTypeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/resource-types")
public class ResourceTypeController {

    private final ResourceTypeService service;

    public ResourceTypeController(ResourceTypeService service) {
        this.service = service;
    }

    @PostMapping
    public ResourceTypeDTO create(@RequestBody ResourceTypeDTO dto) {
        return service.create(dto);
    }

    @GetMapping
    public List<ResourceTypeDTO> list() {
        return service.findAll();
    }
}
