package com.alexandrupavel.smartloanappapi.util;

import com.alexandrupavel.smartloanappapi.dto.UserDTO;
import com.alexandrupavel.smartloanappapi.model.User;

public class UserMapper {

    public static UserDTO toDTO(User user) {
        UserDTO dto = new UserDTO();
        dto.setUserId(user.getUserId());
        dto.setUsername(user.getUsername());
        dto.setFirstName(user.getFirstName());
        dto.setLastName(user.getLastName());
        return dto;
    }

    public static User toEntity(UserDTO dto) {
        return new User(dto.getUserId(), dto.getUsername(), dto.getFirstName(), dto.getLastName());
    }
}
