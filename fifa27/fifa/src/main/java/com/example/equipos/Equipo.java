package com.example.equipos;

import java.time.LocalDate;

public class Equipo {
    private LocalDate fecha_fundacion;
    private String nombre;
    private Double presupuesto;
    
    public Equipo() {
    }
    public Equipo(LocalDate fecha_fundacion, String nombre, Double presupuesto) {
        this.fecha_fundacion = fecha_fundacion;
        this.nombre = nombre;
        this.presupuesto = presupuesto;
    }
    public LocalDate getFecha_fundacion() {
        return fecha_fundacion;
    }
    public void setFecha_fundacion(LocalDate fecha_fundacion) {
        this.fecha_fundacion = fecha_fundacion;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Double getPresupuesto() {
        return presupuesto;
    }
    public void setPresupuesto(Double presupuesto) {
        this.presupuesto = presupuesto;
    }
    
}
