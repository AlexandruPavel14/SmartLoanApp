package com.alexandrupavel.smartloanappapi.repository.income;

import com.alexandrupavel.smartloanappapi.model.income.PastIncome;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PastIncomeRepository extends JpaRepository<PastIncome, Long> {
}
