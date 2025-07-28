package com.alexandrupavel.smartloanappapi.controller.security;

import com.alexandrupavel.smartloanappapi.dto.security.AuditLogDTO;
import com.alexandrupavel.smartloanappapi.service.security.AuditLogService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/audit-logs")
public class AuditLogController {

    private final AuditLogService service;

    public AuditLogController(AuditLogService service) {
        this.service = service;
    }

    @PostMapping
    public AuditLogDTO create(@RequestBody AuditLogDTO dto) {
        return service.create(dto);
    }

    @GetMapping
    public List<AuditLogDTO> list() {
        return service.findAll();
    }
}
