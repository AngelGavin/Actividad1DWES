package com.example.demo.model;

import java.util.UUID;

public class Usuario {

    private String id = UUID.randomUUID().toString();;
    private String alias;
    private String pwd;

    public Usuario(String id, String alias, String pwd) {
        this.id = id;
        this.alias = alias;
        this.pwd = pwd;
    }

    public Usuario(){}

    public String getId() {
        return id;
    }

    public String getAlias() {
        return alias;
    }

    public String getPwd() {
        return pwd;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}
