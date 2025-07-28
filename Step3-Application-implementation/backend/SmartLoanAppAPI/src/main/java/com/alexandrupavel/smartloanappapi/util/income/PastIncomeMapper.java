package com.alexandrupavel.smartloanappapi.util.income;

import com.alexandrupavel.smartloanappapi.dto.income.PastIncomeDTO;
import com.alexandrupavel.smartloanappapi.model.bank.Currency;
import com.alexandrupavel.smartloanappapi.model.income.IncomeBracket;
import com.alexandrupavel.smartloanappapi.model.income.PastIncome;
import com.alexandrupavel.smartloanappapi.model.user.User;

public class PastIncomeMapper {

    public static PastIncome toEntity(PastIncomeDTO dto, User user, IncomeBracket bracket, Currency currency) {
        return new PastIncome(
                dto.getId(),
                user,
                bracket,
                currency,
                dto.getExactAmount(),
                dto.getRecordedAt()
        );
    }

    public static PastIncomeDTO toDTO(PastIncome entity) {
        PastIncomeDTO dto = new PastIncomeDTO();
        dto.setId(entity.getId());
        dto.setUserId(entity.getUser().getUserId());
        dto.setIncomeBracketId(entity.getIncomeBracket().getId());
        dto.setCurrencyId(entity.getCurrency().getCurrencyId());
        dto.setExactAmount(entity.getExactAmount());
        dto.setRecordedAt(entity.getRecordedAt());
        return dto;
    }
}
