package com.david.curso.springboot.webapp.springboot_web.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.david.curso.springboot.webapp.springboot_web.models.dto.ParamDto;
import com.david.curso.springboot.webapp.springboot_web.models.dto.ParamDtoMix;

import jakarta.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/api/params")
public class RequestParamsController {

    @GetMapping("/foo")
    public ParamDto foo(
            @RequestParam(required = false, defaultValue = "Hola que tal", name = "mensaje") String message) {

        ParamDto paramDto = new ParamDto();
        paramDto.setMensage(message);

        return paramDto;
    }

    @GetMapping("/bar")
    public ParamDtoMix bar(@RequestParam String text, @RequestParam Integer code) {
        ParamDtoMix paramDtoMix = new ParamDtoMix();

        paramDtoMix.setMensage(text);
        paramDtoMix.setCode(code);

        return paramDtoMix;
    }

    @GetMapping("/request")
    public ParamDtoMix request(HttpServletRequest request) {
        ParamDtoMix paramDtoMix = new ParamDtoMix();
        Integer code = 0;
        try {
            code = Integer.parseInt(request.getParameter("code"));
        } catch (NumberFormatException e) {

        }
        paramDtoMix.setCode(code);
        paramDtoMix.setMensage(request.getParameter("message"));

        return paramDtoMix;
    }

}
