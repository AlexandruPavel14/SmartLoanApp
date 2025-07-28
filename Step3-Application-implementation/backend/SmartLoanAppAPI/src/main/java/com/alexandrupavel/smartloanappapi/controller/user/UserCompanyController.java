package com.alexandrupavel.smartloanappapi.controller.user;

import com.alexandrupavel.smartloanappapi.dto.user.UserCompanyDTO;
import com.alexandrupavel.smartloanappapi.service.user.UserCompanyService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user-companies")
public class UserCompanyController {

    private final UserCompanyService service;

    public UserCompanyController(UserCompanyService service) {
        this.service = service;
    }

    @PostMapping
    public UserCompanyDTO create(@RequestBody UserCompanyDTO dto) {
        return service.create(dto);
    }

    @GetMapping
    public List<UserCompanyDTO> list() {
        return service.list();
    }
}
