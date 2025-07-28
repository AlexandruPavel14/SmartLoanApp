package com.alexandrupavel.smartloanappapi.util.loan;

import com.alexandrupavel.smartloanappapi.dto.loan.LoanMessageThreadDTO;
import com.alexandrupavel.smartloanappapi.model.loan.GreenLoanApplication;
import com.alexandrupavel.smartloanappapi.model.loan.LoanMessageThread;

public class LoanMessageThreadMapper {

    public static LoanMessageThread toEntity(LoanMessageThreadDTO dto, GreenLoanApplication app) {
        return new LoanMessageThread(
                dto.getId(),
                dto.getSubject(),
                dto.getCreatedAt(),
                app
        );
    }

    public static LoanMessageThreadDTO toDTO(LoanMessageThread entity) {
        LoanMessageThreadDTO dto = new LoanMessageThreadDTO();
        dto.setId(entity.getId());
        dto.setSubject(entity.getSubject());
        dto.setCreatedAt(entity.getCreatedAt());
        dto.setLoanApplicationId(entity.getLoanApplication().getId());
        return dto;
    }
}
