package com.alexandrupavel.smartloanappapi.repository.user;

import com.alexandrupavel.smartloanappapi.model.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
