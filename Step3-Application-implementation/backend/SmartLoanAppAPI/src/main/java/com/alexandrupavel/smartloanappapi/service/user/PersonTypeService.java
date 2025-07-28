package com.alexandrupavel.smartloanappapi.service.user;

import com.alexandrupavel.smartloanappapi.dto.user.PersonTypeDTO;
import com.alexandrupavel.smartloanappapi.model.user.PersonType;
import com.alexandrupavel.smartloanappapi.repository.user.PersonTypeRepository;
import com.alexandrupavel.smartloanappapi.util.user.PersonTypeMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PersonTypeService {

    private final PersonTypeRepository repo;

    public PersonTypeService(PersonTypeRepository repo) {
        this.repo = repo;
    }

    public PersonTypeDTO create(PersonTypeDTO dto) {
        PersonType entity = PersonTypeMapper.toEntity(dto);
        return PersonTypeMapper.toDTO(repo.save(entity));
    }

    public List<PersonTypeDTO> findAll() {
        return repo.findAll().stream()
                .map(PersonTypeMapper::toDTO)
                .collect(Collectors.toList());
    }
}
