package com.alexandrupavel.smartloanappapi.service.user;

import com.alexandrupavel.smartloanappapi.dto.user.UserBankAccountDTO;
import com.alexandrupavel.smartloanappapi.model.user.UserBankAccount;
import com.alexandrupavel.smartloanappapi.repository.user.UserBankAccountRepository;
import com.alexandrupavel.smartloanappapi.util.user.UserBankAccountMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserBankAccountService {

    private final UserBankAccountRepository repo;

    public UserBankAccountService(UserBankAccountRepository repo) {
        this.repo = repo;
    }

    public UserBankAccountDTO create(UserBankAccountDTO dto) {
        UserBankAccount entity = UserBankAccountMapper.toEntity(dto);
        return UserBankAccountMapper.toDTO(repo.save(entity));
    }

    public List<UserBankAccountDTO> findAll() {
        return repo.findAll().stream()
                .map(UserBankAccountMapper::toDTO)
                .collect(Collectors.toList());
    }
}
