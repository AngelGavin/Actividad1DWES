package com.example.demo.service;

import com.example.demo.model.Usuario;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UsuarioService {

    private static List<Usuario> usuarios = new ArrayList<>();

    public static List<Usuario> getTodosUsuarios(){
        return usuarios;
    }

    public static void agregarUsuario(Usuario usuario){
        usuarios.add(usuario);
    }
}
