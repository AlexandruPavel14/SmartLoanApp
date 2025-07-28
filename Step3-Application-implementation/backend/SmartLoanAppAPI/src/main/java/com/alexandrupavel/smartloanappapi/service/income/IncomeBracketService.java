package com.alexandrupavel.smartloanappapi.service.income;

import com.alexandrupavel.smartloanappapi.dto.income.IncomeBracketDTO;
import com.alexandrupavel.smartloanappapi.model.income.IncomeBracket;
import com.alexandrupavel.smartloanappapi.repository.income.IncomeBracketRepository;
import com.alexandrupavel.smartloanappapi.util.income.IncomeBracketMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class IncomeBracketService {

    private final IncomeBracketRepository repo;

    public IncomeBracketService(IncomeBracketRepository repo) {
        this.repo = repo;
    }

    public IncomeBracketDTO create(IncomeBracketDTO dto) {
        IncomeBracket entity = IncomeBracketMapper.toEntity(dto);
        return IncomeBracketMapper.toDTO(repo.save(entity));
    }

    public List<IncomeBracketDTO> findAll() {
        return repo.findAll().stream()
                .map(IncomeBracketMapper::toDTO)
                .collect(Collectors.toList());
    }
}
