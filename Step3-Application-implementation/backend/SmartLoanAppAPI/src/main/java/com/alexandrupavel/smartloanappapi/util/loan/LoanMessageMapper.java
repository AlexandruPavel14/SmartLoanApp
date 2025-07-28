package com.alexandrupavel.smartloanappapi.util.loan;

import com.alexandrupavel.smartloanappapi.dto.loan.LoanMessageDTO;
import com.alexandrupavel.smartloanappapi.model.loan.LoanMessage;
import com.alexandrupavel.smartloanappapi.model.loan.LoanMessageThread;
import com.alexandrupavel.smartloanappapi.model.user.User;

public class LoanMessageMapper {

    public static LoanMessage toEntity(LoanMessageDTO dto, LoanMessageThread thread, User sender) {
        return new LoanMessage(
                dto.getId(),
                dto.getContent(),
                dto.getSentAt(),
                thread,
                sender
        );
    }

    public static LoanMessageDTO toDTO(LoanMessage entity) {
        LoanMessageDTO dto = new LoanMessageDTO();
        dto.setId(entity.getId());
        dto.setContent(entity.getContent());
        dto.setSentAt(entity.getSentAt());
        dto.setThreadId(entity.getThread().getId());
        dto.setSenderUserId(entity.getSender().getUserId());
        return dto;
    }
}
