package com.alexandrupavel.smartloanappapi.repository.user;

import com.alexandrupavel.smartloanappapi.model.user.PersonType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonTypeRepository extends JpaRepository<PersonType, Long> {
}
