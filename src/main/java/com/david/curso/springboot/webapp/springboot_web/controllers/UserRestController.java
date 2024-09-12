package com.david.curso.springboot.webapp.springboot_web.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.david.curso.springboot.webapp.springboot_web.models.User;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/rest")
public class UserRestController {

    @GetMapping("/")
    public Map<String, Object> details() {
        Map<String, Object> body = new HashMap<>();
        User user = new User("David", "Martinez");

        body.put("title", "Hola mundo con Spring Boot");
        body.put("user", user);

        return body;
    }

}
