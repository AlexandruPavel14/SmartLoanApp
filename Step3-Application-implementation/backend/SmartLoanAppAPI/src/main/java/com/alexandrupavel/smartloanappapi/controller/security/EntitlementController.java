package com.alexandrupavel.smartloanappapi.controller.security;

import com.alexandrupavel.smartloanappapi.dto.security.EntitlementDTO;
import com.alexandrupavel.smartloanappapi.service.security.EntitlementService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/entitlements")
public class EntitlementController {

    private final EntitlementService service;

    public EntitlementController(EntitlementService service) {
        this.service = service;
    }

    @PostMapping
    public EntitlementDTO create(@RequestBody EntitlementDTO dto) {
        return service.create(dto);
    }

    @GetMapping
    public List<EntitlementDTO> list() {
        return service.list();
    }
}
