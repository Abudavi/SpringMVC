package com.david.curso.springboot.webapp.springboot_web.controllers;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.david.curso.springboot.webapp.springboot_web.models.User;

@Controller // componente que se maneja en la clase component
public class UserController {

    /*
     * @GetMapping("/details")
     * public String details(Model model) {
     * model.addAttribute("title", "Hola mundo con Spring Boot");
     * model.addAttribute("name", "David");
     * model.addAttribute("lastname", "MTZ");
     * return "details";
     * }
     */
    @GetMapping("/details") // se puede realizar con model o con map
    public String details(Map<String, Object> model) {
        User user = new User("David", "Martinez");

        model.put("title", "Hola mundo con Spring Boot");
        model.put("user", user);
        return "details";
    }
}
