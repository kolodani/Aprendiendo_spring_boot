package com.example;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class ControladorREST {

    @GetMapping("/")
    public String comienzo() {
        // el mensaje del log se mostrará en la consola
        log.info("Estoy ejecutando el controlador MVC");
        // el mensaje del return se mostrará en el navegador
        return "indice";
    }
}
