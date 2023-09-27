package com.example.prueba.servicio;

import org.springframework.stereotype.Service;

@Service
public class PersonaServiceImp implements PersonaService     {

    @Override
    public String getNombre() {
        return "Blanca";
    }
}
