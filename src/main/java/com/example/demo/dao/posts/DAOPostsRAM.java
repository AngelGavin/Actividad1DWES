package com.example.demo.dao.posts;

import com.example.demo.model.Post;

import java.util.ArrayList;
import java.util.List;

public class DAOPostsRAM implements DAOPosts{

    private List<Post> posts = new ArrayList<>();

    public List<Post> getTodosPosts(){
        return posts;
    }

    public void agregarPost(Post post){
        posts.add(post);
    }
}
