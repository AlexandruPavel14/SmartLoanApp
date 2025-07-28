package com.alexandrupavel.smartloanappapi.controller.user;

import com.alexandrupavel.smartloanappapi.dto.user.UserBankAccountDTO;
import com.alexandrupavel.smartloanappapi.service.user.UserBankAccountService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user-bank-accounts")
public class UserBankAccountController {

    private final UserBankAccountService service;

    public UserBankAccountController(UserBankAccountService service) {
        this.service = service;
    }

    @PostMapping
    public UserBankAccountDTO create(@RequestBody UserBankAccountDTO dto) {
        return service.create(dto);
    }

    @GetMapping
    public List<UserBankAccountDTO> list() {
        return service.findAll();
    }
}
