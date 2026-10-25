package com.example.models;

public abstract class MiembroFamilia {
    private String nombre;
    private Integer edad;
    private String rol;
    private Integer energia;
    public MiembroFamilia() {
    }
    public MiembroFamilia(String nombre, Integer edad, String rol, Integer energia) {
        this.nombre = nombre;
        this.edad = edad;
        this.rol = rol;
        this.energia = energia;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Integer getEdad() {
        return edad;
    }
    public void setEdad(Integer edad) {
        this.edad = edad;
    }
    public String getRol() {
        return rol;
    }
    public void setRol(String rol) {
        this.rol = rol;
    }
    public Integer getEnergia() {
        return energia;
    }
    public void setEnergia(Integer energia) {
        this.energia = energia;
    }
    
    public void saludar(){
        System.out.println("hola soy" + this.nombre);
    }

    public void realizarActividad(){
        System.out.println("estoy viendo en tv el show de Krusty");
    }

    public void descansar(){
        System.out.println("Mi energia esta en" + this.energia + "voy a descansar");
    }

    public void mostrarEstado(){
        System.out.println("Por culpa del abuelo mi energia esta en " + this.energia);
    }

    public abstract void ejecutarActividad();

}
