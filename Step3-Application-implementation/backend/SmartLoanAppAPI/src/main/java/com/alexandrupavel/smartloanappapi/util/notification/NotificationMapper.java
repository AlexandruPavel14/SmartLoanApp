package com.alexandrupavel.smartloanappapi.util.notification;

import com.alexandrupavel.smartloanappapi.dto.notification.NotificationDTO;
import com.alexandrupavel.smartloanappapi.model.notification.Notification;
import com.alexandrupavel.smartloanappapi.model.user.User;

public class NotificationMapper {

    public static NotificationDTO toDTO(Notification entity) {
        NotificationDTO dto = new NotificationDTO();
        dto.setNotificationId(entity.getNotificationId());
        dto.setUserId(entity.getUser().getUserId());
        dto.setMessage(entity.getMessage());
        dto.setRead(entity.isRead());
        dto.setCreatedAt(entity.getCreatedAt());
        return dto;
    }

    public static Notification toEntity(NotificationDTO dto, User user) {
        return new Notification(
                dto.getNotificationId(),
                user,
                dto.getMessage(),
                dto.isRead(),
                dto.getCreatedAt()
        );
    }
}
