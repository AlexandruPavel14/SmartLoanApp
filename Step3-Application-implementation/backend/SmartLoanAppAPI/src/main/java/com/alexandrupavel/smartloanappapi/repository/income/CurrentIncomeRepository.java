package com.alexandrupavel.smartloanappapi.repository.income;

import com.alexandrupavel.smartloanappapi.model.income.CurrentIncome;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CurrentIncomeRepository extends JpaRepository<CurrentIncome, Long> {
    List<CurrentIncome> findByUserUserId(Long userId);
}
