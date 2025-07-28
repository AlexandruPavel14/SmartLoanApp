package com.alexandrupavel.smartloanappapi.service.user;

import com.alexandrupavel.smartloanappapi.dto.user.UserCompanyHistoryDTO;
import com.alexandrupavel.smartloanappapi.model.company.Company;
import com.alexandrupavel.smartloanappapi.model.company.RoleInCompany;
import com.alexandrupavel.smartloanappapi.model.user.User;
import com.alexandrupavel.smartloanappapi.model.user.UserCompanyHistory;
import com.alexandrupavel.smartloanappapi.repository.company.CompanyRepository;
import com.alexandrupavel.smartloanappapi.repository.company.RoleInCompanyRepository;
import com.alexandrupavel.smartloanappapi.repository.user.UserCompanyHistoryRepository;
import com.alexandrupavel.smartloanappapi.repository.user.UserRepository;
import com.alexandrupavel.smartloanappapi.util.user.UserCompanyHistoryMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserCompanyHistoryService {

    private final UserCompanyHistoryRepository repo;
    private final UserRepository userRepo;
    private final CompanyRepository companyRepo;
    private final RoleInCompanyRepository roleRepo;

    public UserCompanyHistoryService(UserCompanyHistoryRepository repo,
                                     UserRepository userRepo,
                                     CompanyRepository companyRepo,
                                     RoleInCompanyRepository roleRepo) {
        this.repo = repo;
        this.userRepo = userRepo;
        this.companyRepo = companyRepo;
        this.roleRepo = roleRepo;
    }

    public UserCompanyHistoryDTO create(UserCompanyHistoryDTO dto) {
        User user = userRepo.findById(dto.getUserId()).orElseThrow();
        Company company = companyRepo.findById(dto.getCompanyId()).orElseThrow();
        RoleInCompany role = roleRepo.findById(dto.getRoleInCompanyId()).orElseThrow();

        UserCompanyHistory entity = UserCompanyHistoryMapper.toEntity(dto, user, company, role);
        return UserCompanyHistoryMapper.toDTO(repo.save(entity));
    }

    public List<UserCompanyHistoryDTO> list() {
        return repo.findAll().stream()
                .map(UserCompanyHistoryMapper::toDTO)
                .collect(Collectors.toList());
    }
}
