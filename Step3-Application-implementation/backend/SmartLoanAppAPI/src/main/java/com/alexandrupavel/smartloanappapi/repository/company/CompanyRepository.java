package com.alexandrupavel.smartloanappapi.repository.company;

import com.alexandrupavel.smartloanappapi.model.company.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company, Long> {
}
