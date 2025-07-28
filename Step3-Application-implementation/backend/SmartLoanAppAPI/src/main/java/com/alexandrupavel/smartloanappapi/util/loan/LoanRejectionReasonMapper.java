package com.alexandrupavel.smartloanappapi.util.loan;

import com.alexandrupavel.smartloanappapi.dto.loan.LoanRejectionReasonDTO;
import com.alexandrupavel.smartloanappapi.model.loan.LoanRejectionReason;

public class LoanRejectionReasonMapper {

    public static LoanRejectionReasonDTO toDTO(LoanRejectionReason entity) {
        LoanRejectionReasonDTO dto = new LoanRejectionReasonDTO();
        dto.setId(entity.getId());
        dto.setReasonText(entity.getReasonText());
        return dto;
    }

    public static LoanRejectionReason toEntity(LoanRejectionReasonDTO dto) {
        return new LoanRejectionReason(dto.getId(), dto.getReasonText());
    }
}
