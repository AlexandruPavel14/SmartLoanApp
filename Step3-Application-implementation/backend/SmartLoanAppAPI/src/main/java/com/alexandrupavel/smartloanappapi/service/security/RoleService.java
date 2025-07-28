package com.alexandrupavel.smartloanappapi.service.security;

import com.alexandrupavel.smartloanappapi.dto.security.RoleDTO;
import com.alexandrupavel.smartloanappapi.model.security.Role;
import com.alexandrupavel.smartloanappapi.repository.security.RoleRepository;
import com.alexandrupavel.smartloanappapi.util.security.RoleMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RoleService {

    private final RoleRepository repo;

    public RoleService(RoleRepository repo) {
        this.repo = repo;
    }

    public RoleDTO create(RoleDTO dto) {
        Role role = RoleMapper.toEntity(dto);
        return RoleMapper.toDTO(repo.save(role));
    }

    public List<RoleDTO> findAll() {
        return repo.findAll().stream()
                .map(RoleMapper::toDTO)
                .collect(Collectors.toList());
    }
}
