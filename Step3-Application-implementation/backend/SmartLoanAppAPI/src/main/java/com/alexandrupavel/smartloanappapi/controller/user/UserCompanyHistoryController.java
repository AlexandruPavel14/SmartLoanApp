package com.alexandrupavel.smartloanappapi.controller.user;

import com.alexandrupavel.smartloanappapi.dto.user.UserCompanyHistoryDTO;
import com.alexandrupavel.smartloanappapi.service.user.UserCompanyHistoryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user-company-history")
public class UserCompanyHistoryController {

    private final UserCompanyHistoryService service;

    public UserCompanyHistoryController(UserCompanyHistoryService service) {
        this.service = service;
    }

    @PostMapping
    public UserCompanyHistoryDTO create(@RequestBody UserCompanyHistoryDTO dto) {
        return service.create(dto);
    }

    @GetMapping
    public List<UserCompanyHistoryDTO> list() {
        return service.list();
    }
}
