package com.example.demo.dao.posts;

import com.example.demo.model.Post;
import com.example.demo.model.Usuario;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class DAOPostsRAM implements DAOPosts{

    private List<Post> posts;

    public DAOPostsRAM(){
        this.posts = new ArrayList<>();
    }

    @Override
    public List<Post> getTodosPosts(){
        return posts;
    }

    @Override
    public void agregarPost(Post post){
        posts.add(post);
    }

    @Override
    public Post buscarPorUsuario(Usuario usuario){
        Post postencontrado = null;
        for(Post post: posts){
            if(post.getUsuario() == usuario){
                postencontrado = post;
            }
        }
        return postencontrado;
    }

    @Override
    public Post buscarPorTexto(String texto){
        Post postencontrado = null;
        for(Post post: posts){
            if(post.getMensaje().equals(texto)){
                postencontrado = post;
            }
        }
        return postencontrado;
    }

    @Override
    public Post buscarPorFecha(LocalDateTime fecha){
        Post postencontrado = null;
        for(Post post: posts){
            if(post.getFecha() == fecha){
                postencontrado = post;
            }
        }
        return postencontrado;
    }
}
