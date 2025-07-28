package com.alexandrupavel.smartloanappapi.service.user;

import com.alexandrupavel.smartloanappapi.dto.user.UserActivityLogDTO;
import com.alexandrupavel.smartloanappapi.model.user.UserActivityLog;
import com.alexandrupavel.smartloanappapi.repository.user.UserActivityLogRepository;
import com.alexandrupavel.smartloanappapi.util.user.UserActivityLogMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserActivityLogService {

    private final UserActivityLogRepository repository;

    public UserActivityLogService(UserActivityLogRepository repository) {
        this.repository = repository;
    }

    public UserActivityLogDTO create(UserActivityLogDTO dto) {
        UserActivityLog entity = UserActivityLogMapper.toEntity(dto);
        return UserActivityLogMapper.toDTO(repository.save(entity));
    }

    public List<UserActivityLogDTO> findAll() {
        return repository.findAll()
                .stream()
                .map(UserActivityLogMapper::toDTO)
                .collect(Collectors.toList());
    }
}
