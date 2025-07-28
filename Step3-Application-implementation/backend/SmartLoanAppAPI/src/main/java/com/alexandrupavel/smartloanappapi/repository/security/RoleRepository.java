package com.alexandrupavel.smartloanappapi.repository.security;

import com.alexandrupavel.smartloanappapi.model.security.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
}
