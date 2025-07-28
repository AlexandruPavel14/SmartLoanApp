package com.alexandrupavel.smartloanappapi.controller.security;

import com.alexandrupavel.smartloanappapi.dto.security.RoleDTO;
import com.alexandrupavel.smartloanappapi.service.security.RoleService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/roles")
public class RoleController {

    private final RoleService service;

    public RoleController(RoleService service) {
        this.service = service;
    }

    @PostMapping
    public RoleDTO create(@RequestBody RoleDTO dto) {
        return service.create(dto);
    }

    @GetMapping
    public List<RoleDTO> list() {
        return service.findAll();
    }
}
