package com.example;
import java.util.*;

import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.domain.Individuo;

@Controller
@Slf4j
public class ControladorREST {

    @Value("${indice.hola2}")
    private String hola2;

    @GetMapping("/")
    public String comienzo(Model model) {
        String hola = "Estamos probando mensajes";

        Individuo individuo = new Individuo();
        individuo.setNombre("Grover");
        individuo.setApellido("TheKing");
        individuo.setTelefono("1234567890");
        individuo.setCorreo("groverthebest@gmail.com");
        individuo.setEdad("44 años");

        Individuo individuo2 = new Individuo();
        individuo2.setNombre("Lola");
        individuo2.setApellido("Queen");
        individuo2.setTelefono("6665556660");
        individuo2.setCorreo("lamalvada@gmail.com");
        individuo2.setEdad("22 años");

        // List<Individuo> individuos = new ArrayList();
        // individuos.add(individuo);
        // individuos.add(individuo2);

        List<Individuo> individuos = Arrays.asList(individuo, individuo2);

        log.info("Estoy ejecutando el controlador MVC");
        model.addAttribute("hola", hola);
        model.addAttribute("hola2", hola2);
        model.addAttribute("individuo", individuo);
        model.addAttribute("individuos", individuos);
        return "indice";
    }
}
