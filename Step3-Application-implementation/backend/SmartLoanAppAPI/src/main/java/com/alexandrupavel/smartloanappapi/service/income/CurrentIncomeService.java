package com.alexandrupavel.smartloanappapi.service.income;

import com.alexandrupavel.smartloanappapi.dto.income.CurrentIncomeDTO;
import com.alexandrupavel.smartloanappapi.model.bank.Currency;
import com.alexandrupavel.smartloanappapi.model.income.IncomeBracket;
import com.alexandrupavel.smartloanappapi.model.user.User;
import com.alexandrupavel.smartloanappapi.repository.bank.CurrencyRepository;
import com.alexandrupavel.smartloanappapi.repository.income.CurrentIncomeRepository;
import com.alexandrupavel.smartloanappapi.repository.income.IncomeBracketRepository;
import com.alexandrupavel.smartloanappapi.repository.user.UserRepository;
import com.alexandrupavel.smartloanappapi.util.income.CurrentIncomeMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CurrentIncomeService {

    private final CurrentIncomeRepository incomeRepo;
    private final UserRepository userRepo;
    private final CurrencyRepository currencyRepo;
    private final IncomeBracketRepository bracketRepo;

    public CurrentIncomeService(CurrentIncomeRepository incomeRepo, UserRepository userRepo,
                                CurrencyRepository currencyRepo, IncomeBracketRepository bracketRepo) {
        this.incomeRepo = incomeRepo;
        this.userRepo = userRepo;
        this.currencyRepo = currencyRepo;
        this.bracketRepo = bracketRepo;
    }

    public CurrentIncomeDTO create(CurrentIncomeDTO dto) {
        User user = userRepo.findById(dto.getUserId()).orElseThrow();
        Currency currency = currencyRepo.findById(dto.getCurrencyId()).orElseThrow();
        IncomeBracket bracket = dto.getIncomeBracketId() != null
                ? bracketRepo.findById(dto.getIncomeBracketId()).orElse(null)
                : null;

        var entity = CurrentIncomeMapper.toEntity(dto, user, currency, bracket);
        return CurrentIncomeMapper.toDTO(incomeRepo.save(entity));
    }

    public List<CurrentIncomeDTO> getAllByUserId(Long userId) {
        return incomeRepo.findByUserUserId(userId)
                .stream()
                .map(CurrentIncomeMapper::toDTO)
                .collect(Collectors.toList());
    }
}
