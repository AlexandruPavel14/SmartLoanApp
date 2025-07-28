package com.alexandrupavel.smartloanappapi.service.loan;

import com.alexandrupavel.smartloanappapi.dto.loan.LoanApplicationAttachmentDTO;
import com.alexandrupavel.smartloanappapi.model.loan.GreenLoanApplication;
import com.alexandrupavel.smartloanappapi.model.company.LoanApplicationAttachment;
import com.alexandrupavel.smartloanappapi.repository.loan.GreenLoanApplicationRepository;
import com.alexandrupavel.smartloanappapi.repository.loan.LoanApplicationAttachmentRepository;
import com.alexandrupavel.smartloanappapi.util.loan.LoanApplicationAttachmentMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class LoanApplicationAttachmentService {

    private final LoanApplicationAttachmentRepository repository;
    private final GreenLoanApplicationRepository glaRepository;

    public LoanApplicationAttachmentService(LoanApplicationAttachmentRepository repository, GreenLoanApplicationRepository glaRepository) {
        this.repository = repository;
        this.glaRepository = glaRepository;
    }

    public LoanApplicationAttachmentDTO create(LoanApplicationAttachmentDTO dto) {
        GreenLoanApplication gla = glaRepository.findById(dto.getGreenLoanApplicationId())
                .orElseThrow(() -> new IllegalArgumentException("GreenLoanApplication not found"));
        LoanApplicationAttachment entity = LoanApplicationAttachmentMapper.toEntity(dto, gla);
        return LoanApplicationAttachmentMapper.toDTO(repository.save(entity));
    }

    public List<LoanApplicationAttachmentDTO> findAll() {
        return repository.findAll()
                .stream()
                .map(LoanApplicationAttachmentMapper::toDTO)
                .collect(Collectors.toList());
    }
}
