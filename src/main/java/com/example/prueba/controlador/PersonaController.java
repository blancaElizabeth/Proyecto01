package com.example.prueba.controlador;

import com.example.prueba.servicio.PersonaService;
import com.example.prueba.servicio.PersonaServiceImp;
import com.example.prueba.vo.Persona;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/persona")
public class PersonaController {
    @Autowired
    private PersonaService personaService;

    @GetMapping("/getNombre")
    public String getPersona() {
        return personaService.getNombre();
    }

    @GetMapping("/saludarp/{nombre1}")
    public String saludarP(@PathVariable String nombre1) {
        return "Con Path:: Hola, " + nombre1 ;
    }
    @GetMapping("/saludar")
    public String saludar(@RequestParam(name = "nombre1") String nombre1) {
        return "Con Query param:- Hola, " + nombre1 ;
    }

    //Este es un comentario de prueba
    @PostMapping("/saludarj")
    public String saludar(@RequestBody PersonaServiceImp personaService) {
        return "Acabo de recibir " + personaService.getNombre();
    }
}
