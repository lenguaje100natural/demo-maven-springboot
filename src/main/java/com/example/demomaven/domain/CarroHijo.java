package com.example.demomaven.domain;

public class CarroHijo extends Carro{
    private String atributoHijo;

    public CarroHijo(String id, String atributoHijo) {
        super(id);
        this.atributoHijo = atributoHijo;
    }

    public String getAtributoHijo() {
        return atributoHijo;
    }

    public void setAtributoHijo(String atributoHijo) {
        this.atributoHijo = atributoHijo;
    }

}
