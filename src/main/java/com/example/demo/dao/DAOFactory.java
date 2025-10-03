package com.example.demo.dao;

import com.example.demo.dao.posts.DAOPostsRAM;
import com.example.demo.dao.usuarios.DAOUsuarios;
import com.example.demo.dao.usuarios.DAOUsuariosRAM;

public class DAOFactory {

    private static DAOFactory daoFactory;

    private DAOUsuarios DAOUsuarios;
    private DAOPosts DAOPosts;

    private DAOFactory(){}

    public static DAOFactory getInstance(){
        if(daoFactory == null){
            daoFactory = new DAOFactory();
        }
        return daoFactory;
    }

    public DAOUsuarios getDaousuarios(){
        if(this.daoUsuarios == null){
            this.daoUsuarios = new DAOUsuariosRAM();
        }
        return this.daoUsuarios;
    }

    public DAOPosts getDaoPosts(){
        if(this.daoPosts == null){
            this.daoPosts = new DAOPostsRAM();
        }
        return daoPosts;
    }
}
