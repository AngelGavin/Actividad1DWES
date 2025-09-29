package com.example.demo.model;

public class Usuario {

    private String alias;
    private String contrasenia;

    public Usuario(String alias, String contrasenia) {
        this.alias = alias;
        this.contrasenia = contrasenia;
    }

    public Usuario(){}

    public String getAlias() {
        return alias;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }
}
