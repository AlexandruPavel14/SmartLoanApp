package com.alexandrupavel.smartloanappapi.controller.misc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloPageController {

    @GetMapping("/hello")
    public String helloPage(Model model) {
        model.addAttribute("name", "Alexandru");
        return "hello"; // Renders src/main/resources/templates/hello.html
    }
}