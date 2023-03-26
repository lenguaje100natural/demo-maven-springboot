package com.example.demomaven.domain;

public class Carro {
    private String id;
    private String color;
    private int velocidad;
    public Carro() {
    }

    public Carro(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public float acelerar(int aceleracion) {
        return velocidad += aceleracion; // velocidad = velocidad + aceleracion
    }

    public float frenar(float aceleracion) {
        return velocidad -= aceleracion;// velocidad = velocidad - aceleracion
    }

    /*
        Sobrescritura de funcionalidad toString
     */
    @Override
    public String toString() {
        return "Carro{" +
                "id='" + id + '\'' +
                ", color='" + color + '\'' +
                ", velocidad=" + velocidad +
                '}';
    }
}
