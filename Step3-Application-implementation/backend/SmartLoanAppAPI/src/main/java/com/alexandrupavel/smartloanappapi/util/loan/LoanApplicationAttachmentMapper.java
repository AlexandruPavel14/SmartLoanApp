package com.alexandrupavel.smartloanappapi.util.loan;

import com.alexandrupavel.smartloanappapi.dto.loan.LoanApplicationAttachmentDTO;
import com.alexandrupavel.smartloanappapi.model.loan.GreenLoanApplication;
import com.alexandrupavel.smartloanappapi.model.company.LoanApplicationAttachment;

public class LoanApplicationAttachmentMapper {

    public static LoanApplicationAttachmentDTO toDTO(LoanApplicationAttachment entity) {
        LoanApplicationAttachmentDTO dto = new LoanApplicationAttachmentDTO();
        dto.setId(entity.getId());
        dto.setFileName(entity.getFileName());
        dto.setFileType(entity.getFileType());
        dto.setFileUrl(entity.getFileUrl());
        dto.setGreenLoanApplicationId(entity.getGreenLoanApplication().getId());
        return dto;
    }

    public static LoanApplicationAttachment toEntity(LoanApplicationAttachmentDTO dto, GreenLoanApplication gla) {
        return new LoanApplicationAttachment(
                dto.getId(),
                dto.getFileName(),
                dto.getFileType(),
                dto.getFileUrl(),
                gla
        );
    }
}
