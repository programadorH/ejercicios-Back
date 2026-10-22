package com.example;

import com.example.models.Guerrero;
import com.example.models.Humano;
import com.example.models.Sayayin;

public class Main {
    public static void main(String[] args) {
        // CREANDO UN OBJETO DE LA CLASE SAYAYIN

        Sayayin sayayin = new Sayayin();
        sayayin.setNombre("Gohan");
        sayayin.setEnergia(80);
        sayayin.setNivel(400);
        sayayin.setTieneCola(true);
        sayayin.setFase("2");

        sayayin.entrenar();
        sayayin.mostrarEstado();
        sayayin.atacar();
        sayayin.transformar();
        sayayin.usar_tecnica_sayayin();

        sayayin.ejecutarAtaqueEspecial();

        sayayin.volar();

        System.out.println("******************************************************");

        //CREANDO OBJETO DE TIPO HUMANO
        Humano humano = new  Humano();
        humano.setNombre("Mr Satan");
        humano.setEnergia(50);
        humano.setNivel(5);
        humano.setArteMarcial("Karate Do");
        humano.setNivelDisciplina(100);

        humano.entrenar();
        humano.mostrarEstado();
        humano.atacar();

        humano.esquivar();
        humano.usar_tecnica_humana();
        humano.ejecutarAtaqueEspecial();
    }
}