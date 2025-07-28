package com.alexandrupavel.smartloanappapi.service.income;

import com.alexandrupavel.smartloanappapi.dto.income.PastIncomeDTO;
import com.alexandrupavel.smartloanappapi.model.bank.Currency;
import com.alexandrupavel.smartloanappapi.model.income.IncomeBracket;
import com.alexandrupavel.smartloanappapi.model.income.PastIncome;
import com.alexandrupavel.smartloanappapi.model.user.User;
import com.alexandrupavel.smartloanappapi.repository.bank.CurrencyRepository;
import com.alexandrupavel.smartloanappapi.repository.income.IncomeBracketRepository;
import com.alexandrupavel.smartloanappapi.repository.income.PastIncomeRepository;
import com.alexandrupavel.smartloanappapi.repository.user.UserRepository;
import com.alexandrupavel.smartloanappapi.util.income.PastIncomeMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PastIncomeService {

    private final PastIncomeRepository pastIncomeRepository;
    private final UserRepository userRepository;
    private final IncomeBracketRepository incomeBracketRepository;
    private final CurrencyRepository currencyRepository;

    public PastIncomeService(
            PastIncomeRepository pastIncomeRepository,
            UserRepository userRepository,
            IncomeBracketRepository incomeBracketRepository,
            CurrencyRepository currencyRepository
    ) {
        this.pastIncomeRepository = pastIncomeRepository;
        this.userRepository = userRepository;
        this.incomeBracketRepository = incomeBracketRepository;
        this.currencyRepository = currencyRepository;
    }

    public PastIncomeDTO create(PastIncomeDTO dto) {
        User user = userRepository.findById(dto.getUserId()).orElseThrow();
        IncomeBracket bracket = incomeBracketRepository.findById(dto.getIncomeBracketId()).orElseThrow();
        Currency currency = currencyRepository.findById(dto.getCurrencyId()).orElseThrow();

        PastIncome income = PastIncomeMapper.toEntity(dto, user, bracket, currency);
        return PastIncomeMapper.toDTO(pastIncomeRepository.save(income));
    }

    public List<PastIncomeDTO> findAll() {
        return pastIncomeRepository.findAll().stream()
                .map(PastIncomeMapper::toDTO)
                .collect(Collectors.toList());
    }
}
