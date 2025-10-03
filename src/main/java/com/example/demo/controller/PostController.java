package com.example.demo.controller;

import com.example.demo.dao.DAOFactory;
import com.example.demo.model.Post;
import com.example.demo.model.Usuario;
import com.example.demo.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PostController {

    @Autowired
    private PostService postService;

    @GetMapping("/creacionPost")
    public String creacionPost(){
        return "nuevoPost";
    }

    @PostMapping("/postCreado")
    public String crearPost(@RequestParam String mensaje, @RequestParam String alias){

        Post post = new Post();

        DAOFactory daoFactory = DAOFactory.getInstance();
        Usuario usuario = daoFactory.getDaousuarios().buscarPorAlias(alias);

        post.setMensaje(mensaje);
        post.setFecha(java.time.LocalDateTime.now());
        post.setUsuario(usuario);
        post.setRepostDe(null);

        postService.agregarPost(post);

        return "redirect:/home";
    }
}
