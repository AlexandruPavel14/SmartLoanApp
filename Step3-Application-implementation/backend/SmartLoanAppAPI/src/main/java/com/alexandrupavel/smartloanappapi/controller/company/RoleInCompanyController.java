package com.alexandrupavel.smartloanappapi.controller.company;

import com.alexandrupavel.smartloanappapi.dto.company.RoleInCompanyDTO;
import com.alexandrupavel.smartloanappapi.service.company.RoleInCompanyService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/roles-in-company")
public class RoleInCompanyController {

    private final RoleInCompanyService service;

    public RoleInCompanyController(RoleInCompanyService service) {
        this.service = service;
    }

    @PostMapping
    public RoleInCompanyDTO create(@RequestBody RoleInCompanyDTO dto) {
        return service.create(dto);
    }

    @GetMapping
    public List<RoleInCompanyDTO> list() {
        return service.list();
    }
}
