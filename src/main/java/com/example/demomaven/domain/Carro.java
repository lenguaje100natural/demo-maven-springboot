package com.example.demomaven.domain;

public class Carro implements ICarro{
    private String id;
    private String color;
    private int velocidad;
    private boolean encendido;

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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
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
                ", encendio=" + encendido +
                '}';
    }

    @Override
    public float acelerar(int aceleracion) {
        return velocidad += aceleracion; // velocidad = velocidad + aceleracion
    }

    @Override
    public float frenar(float aceleracion) {
        return velocidad -= aceleracion;// velocidad = velocidad - aceleracion
    }

    @Override
    public boolean encender() {
        return this.encendido = true;
    }
}
