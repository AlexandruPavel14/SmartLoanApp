package com.alexandrupavel.smartloanappapi.util.loan;

import com.alexandrupavel.smartloanappapi.dto.loan.GreenLoanApplicationDTO;
import com.alexandrupavel.smartloanappapi.model.loan.GreenLoanApplication;

public class GreenLoanApplicationMapper {

    public static GreenLoanApplicationDTO toDTO(GreenLoanApplication entity) {
        GreenLoanApplicationDTO dto = new GreenLoanApplicationDTO();
        dto.setId(entity.getId());
        dto.setProjectTitle(entity.getProjectTitle());
        dto.setProjectDescription(entity.getProjectDescription());
        dto.setRequestedAmount(entity.getRequestedAmount());
        dto.setEsgScore(entity.getEsgScore());
        dto.setPublishedInMarketPlace(entity.isPublishedInMarketPlace());
        dto.setSubmittedAt(entity.getSubmittedAt());
        return dto;
    }

    public static GreenLoanApplication toEntity(GreenLoanApplicationDTO dto) {
        return new GreenLoanApplication(
                dto.getId(),
                dto.getProjectTitle(),
                dto.getProjectDescription(),
                dto.getRequestedAmount(),
                dto.getEsgScore(),
                dto.isPublishedInMarketPlace(),
                dto.getSubmittedAt()
        );
    }
}
