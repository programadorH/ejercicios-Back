package com.example.estadios;

public class Prime extends Estadio {

    private String tipo_techo;

    public Prime (){}
    

    public Prime(String tipo_techo) {
        this.tipo_techo = tipo_techo;
    }

    public Prime(String nombre, Integer capacidad, Integer ancho, Integer largo, String tipo_techo) {
        super(nombre, capacidad, ancho, largo);
        this.tipo_techo = tipo_techo;
    }

    public String getTipo_techo() {
        return tipo_techo;
    }

    public void setTipo_techo(String tipo_techo) {
        this.tipo_techo = tipo_techo;
    }
    

}
