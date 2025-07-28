package com.alexandrupavel.smartloanappapi.service.security;

import com.alexandrupavel.smartloanappapi.dto.security.AuditLogDTO;
import com.alexandrupavel.smartloanappapi.model.security.AuditLog;
import com.alexandrupavel.smartloanappapi.repository.security.AuditLogRepository;
import com.alexandrupavel.smartloanappapi.util.security.AuditLogMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AuditLogService {

    private final AuditLogRepository repository;

    public AuditLogService(AuditLogRepository repository) {
        this.repository = repository;
    }

    public AuditLogDTO create(AuditLogDTO dto) {
        AuditLog entity = AuditLogMapper.toEntity(dto);
        return AuditLogMapper.toDTO(repository.save(entity));
    }

    public List<AuditLogDTO> findAll() {
        return repository.findAll()
                .stream()
                .map(AuditLogMapper::toDTO)
                .collect(Collectors.toList());
    }
}
