package com.alexandrupavel.smartloanappapi.service.company;

import com.alexandrupavel.smartloanappapi.dto.company.CompanyDTO;
import com.alexandrupavel.smartloanappapi.model.company.Company;
import com.alexandrupavel.smartloanappapi.model.company.CompanyLegalPrefix;
import com.alexandrupavel.smartloanappapi.model.company.CompanyLegalType;
import com.alexandrupavel.smartloanappapi.model.geo.Country;
import com.alexandrupavel.smartloanappapi.repository.company.CompanyLegalPrefixRepository;
import com.alexandrupavel.smartloanappapi.repository.company.CompanyLegalTypeRepository;
import com.alexandrupavel.smartloanappapi.repository.company.CompanyRepository;
import com.alexandrupavel.smartloanappapi.repository.geo.CountryRepository;
import com.alexandrupavel.smartloanappapi.util.company.CompanyMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CompanyService {

    private final CompanyRepository companyRepo;
    private final CompanyLegalPrefixRepository prefixRepo;
    private final CompanyLegalTypeRepository typeRepo;
    private final CountryRepository countryRepo;

    public CompanyService(CompanyRepository companyRepo,
                          CompanyLegalPrefixRepository prefixRepo,
                          CompanyLegalTypeRepository typeRepo,
                          CountryRepository countryRepo) {
        this.companyRepo = companyRepo;
        this.prefixRepo = prefixRepo;
        this.typeRepo = typeRepo;
        this.countryRepo = countryRepo;
    }

    public CompanyDTO create(CompanyDTO dto) {
        CompanyLegalPrefix prefix = prefixRepo.findById(dto.getLegalPrefixId()).orElseThrow();
        CompanyLegalType type = typeRepo.findById(dto.getLegalTypeId()).orElseThrow();
        Country country = countryRepo.findById(dto.getCountryId()).orElseThrow();

        Company company = CompanyMapper.toEntity(dto, prefix, type, country);
        return CompanyMapper.toDTO(companyRepo.save(company));
    }

    public List<CompanyDTO> list() {
        return companyRepo.findAll().stream()
                .map(CompanyMapper::toDTO)
                .collect(Collectors.toList());
    }
}
