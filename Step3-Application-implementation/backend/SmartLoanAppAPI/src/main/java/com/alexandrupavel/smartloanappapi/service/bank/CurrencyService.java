package com.alexandrupavel.smartloanappapi.service.bank;

import com.alexandrupavel.smartloanappapi.dto.bank.CurrencyDTO;
import com.alexandrupavel.smartloanappapi.model.bank.Currency;
import com.alexandrupavel.smartloanappapi.repository.bank.CurrencyRepository;
import com.alexandrupavel.smartloanappapi.util.bank.CurrencyMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CurrencyService {

    private final CurrencyRepository repo;

    public CurrencyService(CurrencyRepository repo) {
        this.repo = repo;
    }

    public CurrencyDTO create(CurrencyDTO dto) {
        Currency currency = CurrencyMapper.toEntity(dto);
        return CurrencyMapper.toDTO(repo.save(currency));
    }

    public List<CurrencyDTO> findAll() {
        return repo.findAll().stream()
                .map(CurrencyMapper::toDTO)
                .collect(Collectors.toList());
    }
}
