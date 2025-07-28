package com.alexandrupavel.smartloanappapi.repository.notification;

import com.alexandrupavel.smartloanappapi.model.notification.Notification;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface NotificationRepository extends JpaRepository<Notification, Long> {
    List<Notification> findByUserUserId(Long userId);
}
