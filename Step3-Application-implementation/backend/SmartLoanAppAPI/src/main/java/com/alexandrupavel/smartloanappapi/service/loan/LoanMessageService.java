package com.alexandrupavel.smartloanappapi.service.loan;

import com.alexandrupavel.smartloanappapi.dto.loan.LoanMessageDTO;
import com.alexandrupavel.smartloanappapi.model.loan.LoanMessage;
import com.alexandrupavel.smartloanappapi.model.loan.LoanMessageThread;
import com.alexandrupavel.smartloanappapi.model.user.User;
import com.alexandrupavel.smartloanappapi.repository.loan.LoanMessageRepository;
import com.alexandrupavel.smartloanappapi.repository.loan.LoanMessageThreadRepository;
import com.alexandrupavel.smartloanappapi.repository.user.UserRepository;
import com.alexandrupavel.smartloanappapi.util.loan.LoanMessageMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class LoanMessageService {

    private final LoanMessageRepository messageRepo;
    private final LoanMessageThreadRepository threadRepo;
    private final UserRepository userRepo;

    public LoanMessageService(LoanMessageRepository messageRepo,
                              LoanMessageThreadRepository threadRepo,
                              UserRepository userRepo) {
        this.messageRepo = messageRepo;
        this.threadRepo = threadRepo;
        this.userRepo = userRepo;
    }

    public LoanMessageDTO create(LoanMessageDTO dto) {
        LoanMessageThread thread = threadRepo.findById(dto.getThreadId())
                .orElseThrow(() -> new IllegalArgumentException("Thread not found"));
        User sender = userRepo.findById(dto.getSenderUserId())
                .orElseThrow(() -> new IllegalArgumentException("User not found"));

        LoanMessage entity = LoanMessageMapper.toEntity(dto, thread, sender);
        return LoanMessageMapper.toDTO(messageRepo.save(entity));
    }

    public List<LoanMessageDTO> findAll() {
        return messageRepo.findAll()
                .stream()
                .map(LoanMessageMapper::toDTO)
                .collect(Collectors.toList());
    }
}
