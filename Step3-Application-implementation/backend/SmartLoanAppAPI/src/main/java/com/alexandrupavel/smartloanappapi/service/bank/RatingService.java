package com.alexandrupavel.smartloanappapi.service.bank;

import com.alexandrupavel.smartloanappapi.dto.bank.RatingDTO;
import com.alexandrupavel.smartloanappapi.model.bank.Rating;
import com.alexandrupavel.smartloanappapi.model.user.User;
import com.alexandrupavel.smartloanappapi.repository.bank.RatingRepository;
import com.alexandrupavel.smartloanappapi.repository.user.UserRepository;
import com.alexandrupavel.smartloanappapi.util.bank.RatingMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RatingService {

    private final RatingRepository repository;
    private final UserRepository userRepository;

    public RatingService(RatingRepository repository, UserRepository userRepository) {
        this.repository = repository;
        this.userRepository = userRepository;
    }

    public RatingDTO create(RatingDTO dto) {
        User user = userRepository.findById(dto.getUserId())
                .orElseThrow(() -> new IllegalArgumentException("User not found"));
        Rating rating = RatingMapper.toEntity(dto, user);
        return RatingMapper.toDTO(repository.save(rating));
    }

    public List<RatingDTO> findAll() {
        return repository.findAll()
                .stream()
                .map(RatingMapper::toDTO)
                .collect(Collectors.toList());
    }
}
