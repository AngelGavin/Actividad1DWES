package com.example.demo.model;

public class Usuario {

    private String alias;
    private String pwd;

    public Usuario(String alias, String contrasenia) {
        this.alias = alias;
        this.pwd = contrasenia;
    }

    public Usuario(){}


    public String getAlias() {
        return alias;
    }

    public String getPwd() {
        return pwd;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}
