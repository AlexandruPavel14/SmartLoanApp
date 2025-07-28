package com.alexandrupavel.smartloanappapi.controller.file;

import com.alexandrupavel.smartloanappapi.dto.file.CommonBasePathDTO;
import com.alexandrupavel.smartloanappapi.service.file.CommonBasePathService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/common-base-paths")
public class CommonBasePathController {

    private final CommonBasePathService service;

    public CommonBasePathController(CommonBasePathService service) {
        this.service = service;
    }

    @PostMapping
    public CommonBasePathDTO create(@RequestBody CommonBasePathDTO dto) {
        return service.create(dto);
    }

    @GetMapping
    public List<CommonBasePathDTO> getAll() {
        return service.findAll();
    }
}
