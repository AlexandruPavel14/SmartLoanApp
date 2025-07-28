package com.alexandrupavel.smartloanappapi.repository.security;

import com.alexandrupavel.smartloanappapi.model.security.AuditLog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuditLogRepository extends JpaRepository<AuditLog, Long> {
}
