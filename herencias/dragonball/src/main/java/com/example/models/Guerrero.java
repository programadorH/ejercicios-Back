package com.example.models;

public abstract class Guerrero {
    private String nombre;
    private Integer energia;
    private Integer nivel;
    public Guerrero() {
    }
    public Guerrero(String nombre, Integer energia, Integer nivel) {
        this.nombre = nombre;
        this.energia = energia;
        this.nivel = nivel;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Integer getEnergia() {
        return energia;
    }
    public void setEnergia(Integer energia) {
        this.energia = energia;
    }
    public Integer getNivel() {
        return nivel;
    }
    public void setNivel(Integer nivel) {
        this.nivel = nivel;
    }
    
    public void entrenar(){
        System.out.println("Hola estoy entrenando");
    }

    public void atacar(){
        System.out.println("Estoy atacando");
    }

    public void mostrarEstado(){
        System.out.println("Mi estado es: "+ this.energia + "unidades de poder");
    }

    //Programando un método abstracto
    public abstract void ejecutarAtaqueEspecial();
}
