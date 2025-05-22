package com.fernandopaniagua.ifct0062_2025_ws_hello_world.model;

public class Despedida {
    private int id;
    private String nombre;
    public Despedida() {}

    public Despedida(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
