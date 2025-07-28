package com.alexandrupavel.smartloanappapi.controller.notification;

import com.alexandrupavel.smartloanappapi.dto.notification.NotificationDTO;
import com.alexandrupavel.smartloanappapi.service.notification.NotificationService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/notifications")
public class NotificationController {

    private final NotificationService service;

    public NotificationController(NotificationService service) {
        this.service = service;
    }

    @PostMapping
    public NotificationDTO send(@RequestBody NotificationDTO dto) {
        return service.sendNotification(dto);
    }

    @GetMapping("/{userId}")
    public List<NotificationDTO> getUserNotifications(@PathVariable Long userId) {
        return service.getUserNotifications(userId);
    }
}
