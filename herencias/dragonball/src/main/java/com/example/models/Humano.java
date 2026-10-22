package com.example.models;

public class Humano extends Guerrero {

    private String arteMarcial;
    private Integer nivelDisciplina;

    public void usar_tecnica_humana(){
        System.out.println("Usaré las esferas del dragón");
    }

    public void esquivar(){
        System.out.println("Gokuuuuuuu..., ayudame voy a esquivar mientras llegas");
    }

    


    public String getArteMarcial() {
        return arteMarcial;
    }

    public void setArteMarcial(String arteMarcial) {
        this.arteMarcial = arteMarcial;
    }

    public Integer getNivelDisciplina() {
        return nivelDisciplina;
    }

    public void setNivelDisciplina(Integer nivelDisciplina) {
        this.nivelDisciplina = nivelDisciplina;
    }

    @Override
    public void ejecutarAtaqueEspecial() {
        System.out.println("Soy genial, el mejor de todos");
    }



}
