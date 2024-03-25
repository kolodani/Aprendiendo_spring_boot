package com.example;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class ControladorREST {

    @GetMapping("/")
    public String comienzo() {
        return "¡Hola Mundo en Spring!";
    }
}
