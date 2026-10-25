package com.example.models;

import com.example.repositories.IContratosCapacidades;

public class Padre extends MiembroFamilia implements IContratosCapacidades{

    private Integer apetito;
    private String humor;
    private Double peso;
    private String trabajo;

    

    public Integer getApetito() {
        return apetito;
    }



    public void setApetito(Integer apetito) {
        this.apetito = apetito;
    }



    public String getHumor() {
        return humor;
    }



    public void setHumor(String humor) {
        this.humor = humor;
    }



    public Double getPeso() {
        return peso;
    }



    public void setPeso(Double peso) {
        this.peso = peso;
    }



    public String getTrabajo() {
        return trabajo;
    }



    public void setTrabajo(String trabajo) {
        this.trabajo = trabajo;
    }

    
    public void comer(){
        System.out.println("Oye Marge prepárame chuletas dohhh!!!");
    }


    @Override
    public void ejecutarActividad() {
        System.out.println("Oye Bart no consumas drogas");
      
    }



    @Override
    public void correr() {
      System.out.println("vas a morir MOE weeeeee");
    }

}
