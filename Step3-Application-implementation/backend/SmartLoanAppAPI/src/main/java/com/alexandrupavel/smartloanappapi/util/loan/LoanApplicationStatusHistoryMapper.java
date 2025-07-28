package com.alexandrupavel.smartloanappapi.util.loan;

import com.alexandrupavel.smartloanappapi.dto.loan.LoanApplicationStatusHistoryDTO;
import com.alexandrupavel.smartloanappapi.model.loan.LoanApplicationStatusHistory;

public class LoanApplicationStatusHistoryMapper {

    public static LoanApplicationStatusHistoryDTO toDTO(LoanApplicationStatusHistory entity) {
        LoanApplicationStatusHistoryDTO dto = new LoanApplicationStatusHistoryDTO();
        dto.setId(entity.getId());
        dto.setLoanApplicationId(entity.getLoanApplicationId());
        dto.setStatusId(entity.getStatusId());
        dto.setChangedBy(entity.getChangedBy());
        dto.setChangedAt(entity.getChangedAt());
        dto.setNote(entity.getNote());
        return dto;
    }

    public static LoanApplicationStatusHistory toEntity(LoanApplicationStatusHistoryDTO dto) {
        return new LoanApplicationStatusHistory(
                dto.getId(),
                dto.getLoanApplicationId(),
                dto.getStatusId(),
                dto.getChangedBy(),
                dto.getChangedAt(),
                dto.getNote()
        );
    }
}
