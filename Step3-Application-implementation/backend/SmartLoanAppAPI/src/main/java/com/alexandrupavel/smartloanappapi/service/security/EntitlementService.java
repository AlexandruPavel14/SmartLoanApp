package com.alexandrupavel.smartloanappapi.service.security;

import com.alexandrupavel.smartloanappapi.dto.security.EntitlementDTO;
import com.alexandrupavel.smartloanappapi.model.security.Entitlement;
import com.alexandrupavel.smartloanappapi.repository.security.EntitlementRepository;
import com.alexandrupavel.smartloanappapi.util.security.EntitlementMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EntitlementService {

    private final EntitlementRepository repo;

    public EntitlementService(EntitlementRepository repo) {
        this.repo = repo;
    }

    public EntitlementDTO create(EntitlementDTO dto) {
        Entitlement entity = EntitlementMapper.toEntity(dto);
        return EntitlementMapper.toDTO(repo.save(entity));
    }

    public List<EntitlementDTO> list() {
        return repo.findAll()
                .stream()
                .map(EntitlementMapper::toDTO)
                .collect(Collectors.toList());
    }
}
