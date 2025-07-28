package com.alexandrupavel.smartloanappapi.repository.user;

import com.alexandrupavel.smartloanappapi.model.user.UserCompanyHistory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserCompanyHistoryRepository extends JpaRepository<UserCompanyHistory, Long> {
}
