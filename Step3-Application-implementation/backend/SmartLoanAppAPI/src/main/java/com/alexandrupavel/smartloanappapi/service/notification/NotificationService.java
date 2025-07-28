package com.alexandrupavel.smartloanappapi.service.notification;

import com.alexandrupavel.smartloanappapi.dto.notification.NotificationDTO;
import com.alexandrupavel.smartloanappapi.model.notification.Notification;
import com.alexandrupavel.smartloanappapi.model.user.User;
import com.alexandrupavel.smartloanappapi.repository.notification.NotificationRepository;
import com.alexandrupavel.smartloanappapi.repository.user.UserRepository;
import com.alexandrupavel.smartloanappapi.util.notification.NotificationMapper;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class NotificationService {

    private final NotificationRepository notificationRepo;
    private final UserRepository userRepo;

    public NotificationService(NotificationRepository notificationRepo, UserRepository userRepo) {
        this.notificationRepo = notificationRepo;
        this.userRepo = userRepo;
    }

    public NotificationDTO sendNotification(NotificationDTO dto) {
        User user = userRepo.findById(dto.getUserId()).orElseThrow();
        Notification entity = NotificationMapper.toEntity(dto, user);
        if (entity.getCreatedAt() == null) {
            entity.setCreatedAt(LocalDateTime.now());
        }
        return NotificationMapper.toDTO(notificationRepo.save(entity));
    }

    public List<NotificationDTO> getUserNotifications(Long userId) {
        return notificationRepo.findByUserUserId(userId)
                .stream()
                .map(NotificationMapper::toDTO)
                .collect(Collectors.toList());
    }
}
