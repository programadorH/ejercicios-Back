package com.example.competidores;

public class Guerrero {
    
     private String nombre;
     private Integer salud;
     private Integer ataque;
     private Integer defensa;

     public Guerrero() {
     }

     public Guerrero(String nombre, Integer salud, Integer ataque, Integer defensa) {
        this.nombre = nombre;
        this.salud = salud;
        this.ataque = ataque;
        this.defensa = defensa;
     }
     public String getNombre() {
         return nombre;
     }
     public void setNombre(String nombre) {
         this.nombre = nombre;
     }
     public Integer getSalud() {
         return salud;
     }
     public void setSalud(Integer salud) {
         this.salud = salud;
     }
     public Integer getAtaque() {
         return ataque;
     }
     public void setAtaque(Integer ataque) {
         this.ataque = ataque;
     }
     public Integer getDefensa() {
         return defensa;
     }
     public void setDefensa(Integer defensa) {
         this.defensa = defensa;
     }

     
}
