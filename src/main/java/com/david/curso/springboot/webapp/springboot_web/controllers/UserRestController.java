package com.david.curso.springboot.webapp.springboot_web.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.david.curso.springboot.webapp.springboot_web.models.User;
import com.david.curso.springboot.webapp.springboot_web.models.dto.UserDto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/rest")
public class UserRestController {

    @GetMapping("/")
    public UserDto details() {
        UserDto userdDto = new UserDto();
        User user = new User("David", "Martinez");
        userdDto.setUser(user);
        userdDto.setTitle("Hola mundo con Spring Boot");

        return userdDto;
    }

    @GetMapping("/detailsMap")
    public Map<String, Object> detailsMap() {
        Map<String, Object> body = new HashMap<>();
        User user = new User("David", "Martinez");

        body.put("title", "Hola mundo con Spring Boot");
        body.put("user", user);

        return body;
    }

    @GetMapping("/list")
    public List<User> list() {

        User user = new User("Jose", "Guzman");
        User user2 = new User("Luis", "Guzman");
        User user3 = new User("Andres", "Guzman");
        User user4 = new User("Daniel", "Guzman");

        List<User> users = new ArrayList<>();
        users.add(user);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        return users;
    }

}
