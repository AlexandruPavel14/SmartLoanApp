package com.alexandrupavel.smartloanappapi.util.loan;

import com.alexandrupavel.smartloanappapi.dto.loan.LoanReviewDTO;
import com.alexandrupavel.smartloanappapi.model.loan.GreenLoanApplication;
import com.alexandrupavel.smartloanappapi.model.loan.LoanReview;

public class LoanReviewMapper {

    public static LoanReview toEntity(LoanReviewDTO dto, GreenLoanApplication application) {
        return new LoanReview(
                dto.getId(),
                dto.getReviewerName(),
                dto.getComments(),
                dto.getRating(),
                dto.getReviewedAt(),
                application
        );
    }

    public static LoanReviewDTO toDTO(LoanReview entity) {
        LoanReviewDTO dto = new LoanReviewDTO();
        dto.setId(entity.getId());
        dto.setReviewerName(entity.getReviewerName());
        dto.setComments(entity.getComments());
        dto.setRating(entity.getRating());
        dto.setReviewedAt(entity.getReviewedAt());
        dto.setLoanApplicationId(entity.getLoanApplication().getId());
        return dto;
    }
}
