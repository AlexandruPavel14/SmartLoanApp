package com.alexandrupavel.smartloanappapi.util.income;

import com.alexandrupavel.smartloanappapi.dto.income.CurrentIncomeDTO;
import com.alexandrupavel.smartloanappapi.model.bank.Currency;
import com.alexandrupavel.smartloanappapi.model.income.CurrentIncome;
import com.alexandrupavel.smartloanappapi.model.income.IncomeBracket;
import com.alexandrupavel.smartloanappapi.model.user.User;

public class CurrentIncomeMapper {

    public static CurrentIncomeDTO toDTO(CurrentIncome entity) {
        CurrentIncomeDTO dto = new CurrentIncomeDTO();
        dto.setId(entity.getId());
        dto.setUserId(entity.getUser().getUserId());
        dto.setCurrencyId(entity.getCurrency().getCurrencyId());
        dto.setIncomeBracketId(entity.getIncomeBracket() != null ? entity.getIncomeBracket().getId() : null);
        dto.setExactAmount(entity.getExactAmount());
        dto.setRecordedAt(entity.getRecordedAt());
        return dto;
    }

    public static CurrentIncome toEntity(CurrentIncomeDTO dto, User user, Currency currency, IncomeBracket bracket) {
        return new CurrentIncome(
                dto.getId(),
                user,
                bracket,
                currency,
                dto.getExactAmount(),
                dto.getRecordedAt()
        );
    }
}
