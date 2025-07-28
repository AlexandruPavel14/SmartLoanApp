package com.alexandrupavel.smartloanappapi.controller.marketplace;

import com.alexandrupavel.smartloanappapi.dto.marketplace.ProjectTypeDTO;
import com.alexandrupavel.smartloanappapi.service.marketplace.ProjectTypeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/project-types")
public class ProjectTypeController {

    private final ProjectTypeService service;

    public ProjectTypeController(ProjectTypeService service) {
        this.service = service;
    }

    @PostMapping
    public ProjectTypeDTO create(@RequestBody ProjectTypeDTO dto) {
        return service.create(dto);
    }

    @GetMapping
    public List<ProjectTypeDTO> list() {
        return service.list();
    }
}
