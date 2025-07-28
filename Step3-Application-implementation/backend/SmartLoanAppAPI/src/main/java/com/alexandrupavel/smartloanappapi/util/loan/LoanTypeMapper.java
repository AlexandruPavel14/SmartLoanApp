package com.alexandrupavel.smartloanappapi.util.loan;

import com.alexandrupavel.smartloanappapi.dto.loan.LoanTypeDTO;
import com.alexandrupavel.smartloanappapi.model.loan.LoanType;

public class LoanTypeMapper {

    public static LoanTypeDTO toDTO(LoanType entity) {
        LoanTypeDTO dto = new LoanTypeDTO();
        dto.setLoanTypeId(entity.getLoanTypeId());
        dto.setLoanName(entity.getLoanName());
        dto.setDescription(entity.getDescription());
        return dto;
    }

    public static LoanType toEntity(LoanTypeDTO dto) {
        return new LoanType(dto.getLoanTypeId(), dto.getLoanName(), dto.getDescription());
    }
}
