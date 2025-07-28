package com.alexandrupavel.smartloanappapi.controller.geo;

import com.alexandrupavel.smartloanappapi.dto.geo.PhoneNumberFormatDTO;
import com.alexandrupavel.smartloanappapi.service.geo.PhoneNumberFormatService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/phone-number-formats")
public class PhoneNumberFormatController {

    private final PhoneNumberFormatService service;

    public PhoneNumberFormatController(PhoneNumberFormatService service) {
        this.service = service;
    }

    @PostMapping
    public PhoneNumberFormatDTO create(@RequestBody PhoneNumberFormatDTO dto) {
        return service.create(dto);
    }

    @GetMapping
    public List<PhoneNumberFormatDTO> list() {
        return service.findAll();
    }
}
