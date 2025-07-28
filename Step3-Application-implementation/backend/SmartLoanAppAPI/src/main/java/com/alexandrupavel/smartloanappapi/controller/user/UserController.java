package com.alexandrupavel.smartloanappapi.controller.user;

import com.alexandrupavel.smartloanappapi.dto.user.UserDTO;
import com.alexandrupavel.smartloanappapi.service.user.UserService;
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
