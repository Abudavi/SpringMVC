package com.david.curso.springboot.webapp.springboot_web.controllers;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

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

    @GetMapping("/list")
    public String list(ModelMap model) {

        model.addAttribute("title", "Listado de usuarios");

        return "list";
    }

    @ModelAttribute("users")
    public List<User> usersModel() {
        List<User> users = Arrays.asList(
                new User("Pepa", "Gonzales", "Pepa@gmail.com"),
                new User("Lalo", "Perez", "Lalo@gmail.com"),
                new User("Anita", "Doe"));
        return users;
    }
}
