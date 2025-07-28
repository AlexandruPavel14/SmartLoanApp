package com.alexandrupavel.smartloanappapi.controller.file;

import com.alexandrupavel.smartloanappapi.dto.file.AttachmentTypeDTO;
import com.alexandrupavel.smartloanappapi.service.file.AttachmentTypeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/attachment-types")
public class AttachmentTypeController {

    private final AttachmentTypeService service;

    public AttachmentTypeController(AttachmentTypeService service) {
        this.service = service;
    }

    @PostMapping
    public AttachmentTypeDTO create(@RequestBody AttachmentTypeDTO dto) {
        return service.create(dto);
    }

    @GetMapping
    public List<AttachmentTypeDTO> getAll() {
        return service.findAll();
    }
}
