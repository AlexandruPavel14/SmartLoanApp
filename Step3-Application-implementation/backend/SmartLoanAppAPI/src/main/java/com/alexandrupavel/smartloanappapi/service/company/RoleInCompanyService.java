package com.alexandrupavel.smartloanappapi.service.company;

import com.alexandrupavel.smartloanappapi.dto.company.RoleInCompanyDTO;
import com.alexandrupavel.smartloanappapi.model.company.RoleInCompany;
import com.alexandrupavel.smartloanappapi.repository.company.RoleInCompanyRepository;
import com.alexandrupavel.smartloanappapi.util.company.RoleInCompanyMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RoleInCompanyService {

    private final RoleInCompanyRepository repo;

    public RoleInCompanyService(RoleInCompanyRepository repo) {
        this.repo = repo;
    }

    public RoleInCompanyDTO create(RoleInCompanyDTO dto) {
        RoleInCompany role = RoleInCompanyMapper.toEntity(dto);
        return RoleInCompanyMapper.toDTO(repo.save(role));
    }

    public List<RoleInCompanyDTO> list() {
        return repo.findAll().stream()
                .map(RoleInCompanyMapper::toDTO)
                .collect(Collectors.toList());
    }
}
