package com.example.demo.dao.posts;

import com.example.demo.model.Post;
import com.example.demo.model.Usuario;

import java.time.LocalDateTime;
import java.util.List;

public interface DAOPosts {

    public List<Post> getTodosPosts();
    public void agregarPost(Post post);
    public Post buscarPorUsuario(Usuario usuario);
    public Post buscarPorTexto(String texto);
    public Post buscarPorFecha(LocalDateTime fecha);
}
