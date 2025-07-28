package com.alexandrupavel.smartloanappapi.controller.user;

import com.alexandrupavel.smartloanappapi.dto.user.UserActivityLogDTO;
import com.alexandrupavel.smartloanappapi.service.user.UserActivityLogService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user-activity-logs")
public class UserActivityLogController {

    private final UserActivityLogService service;

    public UserActivityLogController(UserActivityLogService service) {
        this.service = service;
    }

    @PostMapping
    public UserActivityLogDTO create(@RequestBody UserActivityLogDTO dto) {
        return service.create(dto);
    }

    @GetMapping
    public List<UserActivityLogDTO> getAll() {
        return service.findAll();
    }
}
