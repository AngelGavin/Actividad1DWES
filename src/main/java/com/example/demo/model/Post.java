package com.example.demo.model;

import java.time.LocalDateTime;
import java.util.UUID;

public class Post {

    private String id = UUID.randomUUID().toString();;
    private String mensaje;
    private LocalDateTime fecha;
    private Usuario usuario;

    private Post repostDe; //Si es null, es el post original, sino, es un repostDe, y este atributo contiene el original.

    public Post(String id, String mensaje, Usuario usuario, LocalDateTime fecha, Post repostDe) {
        this.id = id;
        this.mensaje = mensaje;
        this.usuario = usuario;
        this.fecha = fecha;
        this.repostDe = repostDe;
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

    public Post getRepostDe() {
        return repostDe;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setRepostDe(Post repostDe) {
        this.repostDe = repostDe;
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
