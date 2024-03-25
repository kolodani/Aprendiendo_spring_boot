package com.example;

import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class ControladorREST {

    @Value("${indice.hola2}")
    private String hola2;

    @GetMapping("/")
    public String comienzo(Model model) {
        String hola = "Estamos probando mensajes";
        log.info("Estoy ejecutando el controlador MVC");
        model.addAttribute("hola", hola);
        model.addAttribute("hola2", hola2);
        return "indice";
    }
}
