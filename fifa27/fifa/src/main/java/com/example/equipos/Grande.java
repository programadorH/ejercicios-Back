package com.example.equipos;

import java.time.LocalDate;

public class Grande extends Equipo{
    private Integer numero_abonos;

    public Grande() {
    }

    public Grande(Integer numero_abonos) {
        this.numero_abonos = numero_abonos;
    }

    public Grande(LocalDate fecha_fundacion, String nombre, Double presupuesto) {
        super(fecha_fundacion, nombre, presupuesto);
    }

    public Grande(LocalDate fecha_fundacion, String nombre, Double presupuesto, Integer numero_abonos) {
        super(fecha_fundacion, nombre, presupuesto);
        this.numero_abonos = numero_abonos;
    }
    

    public Integer getNumero_abonos() {
        return numero_abonos;
    }

    public void setNumero_abonos(Integer numero_abonos) {
        this.numero_abonos = numero_abonos;
    }
    
    

}
