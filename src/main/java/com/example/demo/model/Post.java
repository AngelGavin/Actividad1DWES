package com.example.demo.model;

import java.time.LocalDateTime;
import java.util.UUID;

public class Post {

    private String id = UUID.randomUUID().toString();;
    private String mensaje;
    private LocalDateTime fecha;
    private Usuario usuario;

    private Post repost; //Si es null, es el post original, sino, es un repost, y este atributo contiene el original.

    public Post(String id, String mensaje, Usuario usuario, LocalDateTime fecha, Post repost) {
        this.id = id;
        this.mensaje = mensaje;
        this.usuario = usuario;
        this.fecha = fecha;
        this.repost = repost;
    }

    public Post() {}

    public String getId() {
        return id;
    }

    public String getMensaje() {
        return mensaje;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public Post getRepost() {
        return repost;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setRepost(Post repost) {
        this.repost = repost;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
}
