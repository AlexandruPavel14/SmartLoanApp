package com.alexandrupavel.smartloanappapi.util.user;

import com.alexandrupavel.smartloanappapi.dto.user.UserDTO;
import com.alexandrupavel.smartloanappapi.model.user.User;

public class UserMapper {

    public static UserDTO toDTO(User user) {
        UserDTO dto = new UserDTO();
        dto.setUserId(user.getUserId());
        dto.setUsername(user.getUsername());
        dto.setFirstName(user.getFirstName());
        dto.setLastName(user.getLastName());
        dto.setDateOfBirth(user.getDateOfBirth());
        dto.setEmail(user.getEmail());
        dto.setPasswordHash(user.getPasswordHash());
        dto.setAccountCreatedTime(user.getAccountCreatedTime());
        dto.setCnp(user.getCnp());
        dto.setPhoneNumber(user.getPhoneNumber());
        return dto;
    }

    public static User toEntity(UserDTO dto) {
        return new User(
                dto.getUserId(),
                dto.getUsername(),
                dto.getFirstName(),
                dto.getLastName(),
                dto.getDateOfBirth(),
                dto.getEmail(),
                dto.getPasswordHash(),
                dto.getAccountCreatedTime(),
                dto.getCnp(),
                dto.getPhoneNumber()
        );
    }
}
