package com.example.demo.service;

import com.example.demo.model.Post;
import com.example.demo.model.Usuario;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PostService {

    private List<Post> posts = new ArrayList<>();

    public List<Post> getTodosPosts(){
        return posts;
    }

    public void agregarPost(Post post){
        posts.add(post);
    }
}
