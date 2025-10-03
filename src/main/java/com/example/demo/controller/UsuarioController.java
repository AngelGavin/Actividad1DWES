package com.example.demo.controller;

import com.example.demo.dao.DAOFactory;
import com.example.demo.model.Post;
import com.example.demo.model.Usuario;
import com.example.demo.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.List;

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
    public String goHome(@RequestParam String alias, Model model){

        DAOFactory daoFactory = DAOFactory.getInstance();
        Usuario usuario = daoFactory.getDaousuarios().buscarPorAlias(alias);

        if(usuario == null){
            return "redirect:/inicioSesionUsuario";
        }

        //List<Post> postsUsuario = daoFactory.getDaoPosts().

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
    public String iniciarSesionUsuario(@RequestParam String alias, @RequestParam String pwd){
        Usuario usuario = usuarioService.buscarPorAlias(alias);

        if(usuario != null && usuario.getPwd().equals(pwd)){
            return "redirect:/home?alias=" + URLEncoder.encode(alias, StandardCharsets.UTF_8);
        }
        return "redirect:/inicioSesionUsuario";
    }

}
