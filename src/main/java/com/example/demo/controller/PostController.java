package com.example.demo.controller;

import com.example.demo.model.Post;
import com.example.demo.model.Usuario;
import com.example.demo.service.PostService;
import jakarta.servlet.http.HttpSession;
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
    public String crearPost(@RequestParam String mensaje, HttpSession session){

        Usuario usuarioLogueado = (Usuario) session.getAttribute("usuarioLogueado");

        if(usuarioLogueado == null){
            return "redirect:/inicioSesionUsuario";
        }

        Post post = new Post();
        post.setMensaje(mensaje);
        post.setFecha(java.time.LocalDateTime.now());
        post.setUsuario(usuarioLogueado);
        post.setRepostDe(null);

        postService.agregarPost(post);

        return "redirect:/home";
    }
}
