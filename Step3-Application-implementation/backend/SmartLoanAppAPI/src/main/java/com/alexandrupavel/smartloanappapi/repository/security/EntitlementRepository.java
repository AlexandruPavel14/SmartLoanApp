package com.alexandrupavel.smartloanappapi.repository.security;

import com.alexandrupavel.smartloanappapi.model.security.Entitlement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EntitlementRepository extends JpaRepository<Entitlement, Long> {
}
