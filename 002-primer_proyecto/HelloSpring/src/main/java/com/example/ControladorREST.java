package com.example;

import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

import org.springframework.web.bind.annotation.GetMapping;

@RestController
@Slf4j
public class ControladorREST {

    @GetMapping("/")
    public String comienzo() {
        // el mensaje del log se mostrará en la consola
        log.info("Estoy ejecutando el controlador REST");
        log.debug("MAS INFORMACION");
        // el mensaje del return se mostrará en el navegador
        return "¡Mi Primer Hola Mundo en Spring!";
    }
}
