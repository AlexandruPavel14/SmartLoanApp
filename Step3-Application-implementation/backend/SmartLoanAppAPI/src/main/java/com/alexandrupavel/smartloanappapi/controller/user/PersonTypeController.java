package com.alexandrupavel.smartloanappapi.controller.user;

import com.alexandrupavel.smartloanappapi.dto.user.PersonTypeDTO;
import com.alexandrupavel.smartloanappapi.service.user.PersonTypeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/person-types")
public class PersonTypeController {

    private final PersonTypeService service;

    public PersonTypeController(PersonTypeService service) {
        this.service = service;
    }

    @PostMapping
    public PersonTypeDTO create(@RequestBody PersonTypeDTO dto) {
        return service.create(dto);
    }

    @GetMapping
    public List<PersonTypeDTO> list() {
        return service.findAll();
    }
}
