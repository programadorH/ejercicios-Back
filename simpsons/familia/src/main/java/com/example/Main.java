package com.example;
import com.example.models.Padre;

public class Main {
    public static void main(String[] args) {

        Padre padre = new Padre();
        padre.setNombre("Homero");
        padre.setEdad(40);
        padre.setPeso(130.5);
        padre.setHumor("torpe");
        padre.setEnergia(100);
        padre.setRol("jefe del hogar");
        padre.setTrabajo("tecnico");
        padre.comer();
        padre.correr();
        padre.realizarActividad();
        padre.ejecutarActividad();


    }
}