package com.example;

import java.time.LocalDate;

import com.example.equipos.Grande;
import com.example.estadios.Prime;

public class Main {
    public static void main(String[] args) {
      /*   Prime prime = new Prime();
        prime.setNombre("Bernabeu");
        prime.setCapacidad(80000);
        prime.setAncho(100);
        prime.setLargo(150); */

        Grande grande = new Grande();
        Grande grandeDos = new Grande(500000);
        Grande grandeTres = new Grande(LocalDate.now(), "Deportivo Nutresa FC", 100000.0);
        Grande grandeCuatro = new Grande(LocalDate.now(), "Deportivo Cesde Mde",150000.0, 900000);
    }
}