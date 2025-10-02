package com.example.demo.controller;

import com.example.demo.model.Usuario;
import com.example.demo.service.UsuarioService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/inicioSesionUsuario")
    public String iniciarSesion(){
        return "inicioSesionUsuario";
    }

    @GetMapping("/registroUsuario")
    public String registrarse(){
        return "registroUsuario";
    }

    @GetMapping("/home")
    public String goHome(Model model, HttpSession session){

        Usuario usuarioLogueado = (Usuario) session.getAttribute("usuarioLogueado");

        if(usuarioLogueado == null){
            return "redirect:/inicioSesionusuario";
        }

        model.addAttribute("usuario", usuarioLogueado);
        return "home";
    }

    @PostMapping("/usuarioRegistrado")
    public String registrarUsuario(@RequestParam String alias, @RequestParam String pwd){
        Usuario usuario = new Usuario();
        usuario.setAlias(alias);
        usuario.setPwd(pwd);
        usuarioService.agregarUsuario(usuario);
        return "redirect:/inicioSesionUsuario";
    }

    @PostMapping("/usuarioSesionIniciada")
    public String iniciarSesionUsuario(@RequestParam String alias, @RequestParam String pwd, HttpSession session){
        Usuario usuario = usuarioService.buscarPorAlias(alias);

        if(usuario != null && usuario.getPwd().equals(pwd)){
            session.setAttribute("usuarioLogueado", usuario);
            return "redirect:/home";
        }
        return "redirect:/inicioSesionUsuario";
    }

}
