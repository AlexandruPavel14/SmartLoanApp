package com.alexandrupavel.smartloanappapi.service.bank;

import com.alexandrupavel.smartloanappapi.dto.bank.BankDTO;
import com.alexandrupavel.smartloanappapi.model.bank.Bank;
import com.alexandrupavel.smartloanappapi.repository.bank.BankRepository;
import com.alexandrupavel.smartloanappapi.util.bank.BankMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BankService {

    private final BankRepository repo;

    public BankService(BankRepository repo) {
        this.repo = repo;
    }

    public BankDTO create(BankDTO dto) {
        Bank entity = BankMapper.toEntity(dto);
        return BankMapper.toDTO(repo.save(entity));
    }

    public List<BankDTO> findAll() {
        return repo.findAll().stream()
                .map(BankMapper::toDTO)
                .collect(Collectors.toList());
    }
}
