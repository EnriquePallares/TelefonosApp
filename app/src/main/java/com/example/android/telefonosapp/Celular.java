package com.example.android.telefonosapp;

import android.content.Intent;

public class Celular {
    private String marca;
    private String color;
    private int capacidad;
    private String sistOperativo;
    private int precio;

    public Celular(String marca, String color, int capacidad, String sistOperativo, int precio) {
        this.marca = marca;
        this.color = color;
        this.capacidad = capacidad;
        this.sistOperativo = sistOperativo;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getSistOperativo() {
        return sistOperativo;
    }

    public void setSistOperativo(String sistOperativo) {
        this.sistOperativo = sistOperativo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void guardar(){
        Datos.guardar(this);
    }
}
