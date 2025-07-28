package com.alexandrupavel.smartloanappapi.controller;

import com.alexandrupavel.smartloanappapi.dto.UserDTO;
import com.alexandrupavel.smartloanappapi.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    @PostMapping
    public UserDTO create(@RequestBody UserDTO dto) {
        return service.create(dto);
    }

    @GetMapping
    public List<UserDTO> list() {
        return service.findAll();
    }
}
