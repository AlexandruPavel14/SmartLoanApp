package com.alexandrupavel.smartloanappapi.service;

import com.alexandrupavel.smartloanappapi.dto.UserDTO;
import com.alexandrupavel.smartloanappapi.model.User;
import com.alexandrupavel.smartloanappapi.repository.UserRepository;
import com.alexandrupavel.smartloanappapi.util.UserMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {
    private final UserRepository repo;

    public UserService(UserRepository repo) {
        this.repo = repo;
    }

    public UserDTO create(UserDTO dto) {
        User user = UserMapper.toEntity(dto);
        return UserMapper.toDTO(repo.save(user));
    }

    public List<UserDTO> findAll() {
        return repo.findAll().stream()
                .map(UserMapper::toDTO)
                .collect(Collectors.toList());
    }
}
