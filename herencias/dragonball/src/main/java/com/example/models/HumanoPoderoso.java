package com.example.models;

import com.example.repositories.IContratoGuerrero;

public class HumanoPoderoso extends Humano implements IContratoGuerrero{

    @Override
    public void volar() {
        System.out.println("Voy a por ti, no corras que te alcanzaré");
    }

}
