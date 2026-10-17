package com.example.estadios;

public class Estadio {
    private String nombre;
    private Integer capacidad;
    private Integer ancho;
    private Integer largo;
    public Estadio() {
    }
    public Estadio(String nombre, Integer capacidad, Integer ancho, Integer largo) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.ancho = ancho;
        this.largo = largo;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Integer getCapacidad() {
        return capacidad;
    }
    public void setCapacidad(Integer capacidad) {
        this.capacidad = capacidad;
    }
    public Integer getAncho() {
        return ancho;
    }
    public void setAncho(Integer ancho) {
        this.ancho = ancho;
    }
    public Integer getLargo() {
        return largo;
    }
    public void setLargo(Integer largo) {
        this.largo = largo;
    }

    
    
}
