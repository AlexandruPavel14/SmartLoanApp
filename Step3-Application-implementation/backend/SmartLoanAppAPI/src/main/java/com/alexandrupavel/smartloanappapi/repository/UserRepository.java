package com.alexandrupavel.smartloanappapi.repository;

import com.alexandrupavel.smartloanappapi.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
