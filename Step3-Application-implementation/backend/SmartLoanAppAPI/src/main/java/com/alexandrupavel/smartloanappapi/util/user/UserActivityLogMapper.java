package com.alexandrupavel.smartloanappapi.util.user;

import com.alexandrupavel.smartloanappapi.dto.user.UserActivityLogDTO;
import com.alexandrupavel.smartloanappapi.model.user.UserActivityLog;

public class UserActivityLogMapper {

    public static UserActivityLogDTO toDTO(UserActivityLog entity) {
        UserActivityLogDTO dto = new UserActivityLogDTO();
        dto.setId(entity.getId());
        dto.setUserId(entity.getUserId());
        dto.setActivityType(entity.getActivityType());
        dto.setDescription(entity.getDescription());
        dto.setTimestamp(entity.getTimestamp());
        return dto;
    }

    public static UserActivityLog toEntity(UserActivityLogDTO dto) {
        return new UserActivityLog(
                dto.getId(),
                dto.getUserId(),
                dto.getActivityType(),
                dto.getDescription(),
                dto.getTimestamp()
        );
    }
}
