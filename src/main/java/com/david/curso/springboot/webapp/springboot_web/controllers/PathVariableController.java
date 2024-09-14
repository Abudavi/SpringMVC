package com.david.curso.springboot.webapp.springboot_web.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.david.curso.springboot.webapp.springboot_web.models.dto.ParamDto;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/api/var")
public class PathVariableController {

    @GetMapping("/baz/{message}")
    public ParamDto bar(@PathVariable String message) {
        ParamDto paramDto = new ParamDto();
        paramDto.setMensage(message);
        return paramDto;
    }

}
