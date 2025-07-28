package com.alexandrupavel.smartloanappapi.util.notification;

import com.alexandrupavel.smartloanappapi.dto.notification.NotificationTypeDTO;
import com.alexandrupavel.smartloanappapi.model.notification.NotificationType;

public class NotificationTypeMapper {

    public static NotificationTypeDTO toDTO(NotificationType entity) {
        NotificationTypeDTO dto = new NotificationTypeDTO();
        dto.setId(entity.getId());
        dto.setName(entity.getName());
        return dto;
    }

    public static NotificationType toEntity(NotificationTypeDTO dto) {
        return new NotificationType(dto.getId(), dto.getName());
    }
}
