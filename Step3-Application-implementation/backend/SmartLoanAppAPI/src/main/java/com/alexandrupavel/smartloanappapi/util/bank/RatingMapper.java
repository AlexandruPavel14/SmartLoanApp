package com.alexandrupavel.smartloanappapi.util.bank;

import com.alexandrupavel.smartloanappapi.dto.bank.RatingDTO;
import com.alexandrupavel.smartloanappapi.model.bank.Rating;
import com.alexandrupavel.smartloanappapi.model.user.User;

public class RatingMapper {

    public static RatingDTO toDTO(Rating entity) {
        RatingDTO dto = new RatingDTO();
        dto.setId(entity.getId());
        dto.setScore(entity.getScore());
        dto.setComment(entity.getComment());
        dto.setUserId(entity.getUser().getUserId());
        return dto;
    }

    public static Rating toEntity(RatingDTO dto, User user) {
        return new Rating(
                dto.getId(),
                dto.getScore(),
                dto.getComment(),
                user
        );
    }
}
