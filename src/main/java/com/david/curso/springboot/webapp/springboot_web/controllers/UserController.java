package com.david.curso.springboot.webapp.springboot_web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller // componente que se maneja en la clase component
public class UserController {

    @GetMapping("/details")
    public String details() {

        return "index";
    }
}
