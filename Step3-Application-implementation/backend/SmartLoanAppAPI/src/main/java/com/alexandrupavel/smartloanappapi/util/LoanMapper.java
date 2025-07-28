package com.alexandrupavel.smartloanappapi.util;

import com.alexandrupavel.smartloanappapi.dto.LoanDTO;
import com.alexandrupavel.smartloanappapi.model.Loan;

public class LoanMapper {
    public static LoanDTO toDTO(Loan loan) {
        LoanDTO dto = new LoanDTO();
        dto.setId(loan.getId());
        dto.setAmount(loan.getAmount());
        dto.setStartDate(loan.getStartDate());
        dto.setTermMonths(loan.getTermMonths());
        return dto;
    }

    public static Loan toEntity(LoanDTO dto) {
        return new Loan(dto.getId(), dto.getAmount(), dto.getStartDate(), dto.getTermMonths());
    }
}
