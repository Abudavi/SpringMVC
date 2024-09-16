package com.david.curso.springboot.webapp.springboot_web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping({ "", "/", "/home" })
    public String home() {
        return "forward:/details";// se puede con forward que va a mantener los valores https ejmplo
                                  // localhost/home a localhost/home
                                  // redirect redirige y cambia la ruta https ejemplo localhost/home a
                                  // localhost/details
    }

}
