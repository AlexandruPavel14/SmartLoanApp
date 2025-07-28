package com.alexandrupavel.smartloanappapi.util.loan;

import com.alexandrupavel.smartloanappapi.dto.loan.LoanApplicationStatusDTO;
import com.alexandrupavel.smartloanappapi.model.loan.LoanApplicationStatus;

public class LoanApplicationStatusMapper {

    public static LoanApplicationStatus toEntity(LoanApplicationStatusDTO dto) {
        return new LoanApplicationStatus(dto.getId(), dto.getStatusLabel());
    }

    public static LoanApplicationStatusDTO toDTO(LoanApplicationStatus entity) {
        LoanApplicationStatusDTO dto = new LoanApplicationStatusDTO();
        dto.setId(entity.getId());
        dto.setStatusLabel(entity.getStatusLabel());
        return dto;
    }
}
