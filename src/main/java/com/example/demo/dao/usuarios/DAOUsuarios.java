package com.example.demo.dao.usuarios;

import com.example.demo.model.Usuario;

import java.util.List;

public interface DAOUsuarios {

    public List<Usuario> getTodosUsuarios();
    public void agregarUsuario(Usuario usuario);
    public Usuario buscarPorAlias(String alias);
}
