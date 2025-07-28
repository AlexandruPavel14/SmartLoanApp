package com.alexandrupavel.smartloanappapi.repository.notification;

import com.alexandrupavel.smartloanappapi.model.notification.NotificationType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotificationTypeRepository extends JpaRepository<NotificationType, Long> {
}
