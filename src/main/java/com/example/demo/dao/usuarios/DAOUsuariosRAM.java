package com.example.demo.dao.usuarios;

import com.example.demo.model.Usuario;

import java.util.ArrayList;
import java.util.List;

public class DAOUsuariosRAM implements DAOUsuarios{

    private List<Usuario> usuarios;

    public DAOUsuariosRAM(){
        this.usuarios = new ArrayList<>();
    }

    @Override
    public List<Usuario> getTodosUsuarios(){
        return this.usuarios;
    }

    @Override
    public void agregarUsuario(Usuario usuario){
        this.usuarios.add(usuario);
    }

    @Override
    public Usuario buscarPorAlias(String alias){
        Usuario usuarioEncontrado = null;
        for(Usuario u: usuarios){
            if(u.getAlias().equals(alias)){
                usuarioEncontrado = u;
            }
        }
        return usuarioEncontrado;
    }
}
