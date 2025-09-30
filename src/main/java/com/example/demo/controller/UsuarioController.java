package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class UsuarioController {

    @GetMapping("/inicioSesionUsuario")
    public String iniciarSesion(){
        return "inicioSesionUsuario";
    }

    @GetMapping("/registroUsuario")
    public String registrarse(){
        return "registroUsuario";
    }

    @GetMapping("/usuarioRegistrado")
    public String registrarUsuario(){

    }

}
