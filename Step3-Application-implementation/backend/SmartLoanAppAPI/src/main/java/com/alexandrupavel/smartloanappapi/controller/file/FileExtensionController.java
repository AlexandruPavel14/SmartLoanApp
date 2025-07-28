package com.alexandrupavel.smartloanappapi.controller.file;

import com.alexandrupavel.smartloanappapi.dto.file.FileExtensionDTO;
import com.alexandrupavel.smartloanappapi.service.file.FileExtensionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/file-extensions")
public class FileExtensionController {

    private final FileExtensionService service;

    public FileExtensionController(FileExtensionService service) {
        this.service = service;
    }

    @PostMapping
    public FileExtensionDTO create(@RequestBody FileExtensionDTO dto) {
        return service.create(dto);
    }

    @GetMapping
    public List<FileExtensionDTO> list() {
        return service.findAll();
    }
}
