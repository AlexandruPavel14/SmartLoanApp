package com.alexandrupavel.smartloanappapi.controller.notification;

import com.alexandrupavel.smartloanappapi.dto.notification.NotificationTypeDTO;
import com.alexandrupavel.smartloanappapi.service.notification.NotificationTypeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/notification-types")
public class NotificationTypeController {

    private final NotificationTypeService service;

    public NotificationTypeController(NotificationTypeService service) {
        this.service = service;
    }

    @PostMapping
    public NotificationTypeDTO create(@RequestBody NotificationTypeDTO dto) {
        return service.create(dto);
    }

    @GetMapping
    public List<NotificationTypeDTO> list() {
        return service.list();
    }
}
