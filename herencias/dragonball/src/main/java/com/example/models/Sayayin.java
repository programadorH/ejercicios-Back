package com.example.models;

import com.example.repositories.IContratoGuerrero;

public class Sayayin extends Guerrero implements IContratoGuerrero{

    private String fase;
    private Boolean tieneCola;

    public void transformar(){
        System.out.println("AHGGG....");
    }


    public void usar_tecnica_sayayin(){
        System.out.println("mirar la luna");
    }

    

    public Sayayin() {
    }

    

    public Sayayin(String nombre, Integer energia, Integer nivel, String fase, Boolean tieneCola) {
        super(nombre, energia, nivel);
        this.fase = fase;
        this.tieneCola = tieneCola;
    }

    

    public String getFase() {
        return fase;
    }


    public void setFase(String fase) {
        this.fase = fase;
    }


    public Boolean getTieneCola() {
        return tieneCola;
    }


    public void setTieneCola(Boolean tieneCola) {
        this.tieneCola = tieneCola;
    }


    @Override
    public void ejecutarAtaqueEspecial() {
        
    }


    @Override
    public void volar() {
        System.out.println("Elevo mi KI y salgo disparado a volar...");
    }

}
