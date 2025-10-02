package com.example.demo.service;

import com.example.demo.model.Usuario;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UsuarioService {

    private List<Usuario> usuarios = new ArrayList<>();

    public List<Usuario> getTodosUsuarios(){
        return usuarios;
    }

    public void agregarUsuario(Usuario usuario){
        usuarios.add(usuario);
    }

    public Usuario buscarPorAlias(String alias){
        for(Usuario u: usuarios){
            if(u.getAlias().equals(alias)){
                return u;
            }
        }
        return null;
    }
}
