package com.alexandrupavel.smartloanappapi.service.user;

import com.alexandrupavel.smartloanappapi.dto.user.UserCompanyDTO;
import com.alexandrupavel.smartloanappapi.model.company.Company;
import com.alexandrupavel.smartloanappapi.model.company.RoleInCompany;
import com.alexandrupavel.smartloanappapi.model.user.User;
import com.alexandrupavel.smartloanappapi.model.user.UserCompany;
import com.alexandrupavel.smartloanappapi.repository.company.CompanyRepository;
import com.alexandrupavel.smartloanappapi.repository.company.RoleInCompanyRepository;
import com.alexandrupavel.smartloanappapi.repository.user.UserCompanyRepository;
import com.alexandrupavel.smartloanappapi.repository.user.UserRepository;
import com.alexandrupavel.smartloanappapi.util.user.UserCompanyMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserCompanyService {

    private final UserCompanyRepository repo;
    private final UserRepository userRepo;
    private final CompanyRepository companyRepo;
    private final RoleInCompanyRepository roleRepo;

    public UserCompanyService(UserCompanyRepository repo, UserRepository userRepo,
                              CompanyRepository companyRepo, RoleInCompanyRepository roleRepo) {
        this.repo = repo;
        this.userRepo = userRepo;
        this.companyRepo = companyRepo;
        this.roleRepo = roleRepo;
    }

    public UserCompanyDTO create(UserCompanyDTO dto) {
        User user = userRepo.findById(dto.getUserId()).orElseThrow();
        Company company = companyRepo.findById(dto.getCompanyId()).orElseThrow();
        RoleInCompany role = roleRepo.findById(dto.getRoleInCompanyId()).orElseThrow();

        UserCompany entity = UserCompanyMapper.toEntity(dto, user, company, role);
        return UserCompanyMapper.toDTO(repo.save(entity));
    }

    public List<UserCompanyDTO> list() {
        return repo.findAll().stream()
                .map(UserCompanyMapper::toDTO)
                .collect(Collectors.toList());
    }
}
