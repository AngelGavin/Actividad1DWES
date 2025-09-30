package com.example.demo.controller;

import com.example.demo.model.Usuario;
import com.example.demo.service.UsuarioService;
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

    @GetMapping("/home")
    public String goHome(){
        return "home";
    }

    @PostMapping("/usuarioRegistrado")
    public String registrarUsuario(@RequestParam String alias, @RequestParam String pwd){
        Usuario usuario = new Usuario();
        usuario.setAlias(alias);
        usuario.setPwd(pwd);
        UsuarioService.agregarUsuario(usuario);
        return "redirect:/inicioSesionUsuario";
    }

    @PostMapping("/usuarioSesionIniciada")
    public String iniciarSesionUsuario(@RequestParam String alias, @RequestParam String pwd){
        return "redirect:/home";
    }

}
