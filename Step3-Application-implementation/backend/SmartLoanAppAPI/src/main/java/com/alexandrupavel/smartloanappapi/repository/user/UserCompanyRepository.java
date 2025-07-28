package com.alexandrupavel.smartloanappapi.repository.user;

import com.alexandrupavel.smartloanappapi.model.user.UserCompany;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserCompanyRepository extends JpaRepository<UserCompany, Long> {
}
