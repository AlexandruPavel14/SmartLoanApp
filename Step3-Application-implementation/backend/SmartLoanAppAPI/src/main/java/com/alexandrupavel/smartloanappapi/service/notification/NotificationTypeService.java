package com.alexandrupavel.smartloanappapi.service.notification;

import com.alexandrupavel.smartloanappapi.dto.notification.NotificationTypeDTO;
import com.alexandrupavel.smartloanappapi.model.notification.NotificationType;
import com.alexandrupavel.smartloanappapi.repository.notification.NotificationTypeRepository;
import com.alexandrupavel.smartloanappapi.util.notification.NotificationTypeMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class NotificationTypeService {

    private final NotificationTypeRepository repo;

    public NotificationTypeService(NotificationTypeRepository repo) {
        this.repo = repo;
    }

    public NotificationTypeDTO create(NotificationTypeDTO dto) {
        NotificationType entity = NotificationTypeMapper.toEntity(dto);
        return NotificationTypeMapper.toDTO(repo.save(entity));
    }

    public List<NotificationTypeDTO> list() {
        return repo.findAll()
                .stream()
                .map(NotificationTypeMapper::toDTO)
                .collect(Collectors.toList());
    }
}
