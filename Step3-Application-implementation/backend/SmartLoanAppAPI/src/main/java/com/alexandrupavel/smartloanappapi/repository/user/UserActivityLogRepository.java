package com.alexandrupavel.smartloanappapi.repository.user;

import com.alexandrupavel.smartloanappapi.model.user.UserActivityLog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserActivityLogRepository extends JpaRepository<UserActivityLog, Long> {
}
