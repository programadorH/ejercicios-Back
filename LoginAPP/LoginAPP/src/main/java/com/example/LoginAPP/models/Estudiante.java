package com.example.LoginAPP.models;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity 
@Table (name= "Estudiantes")

public class Estudiante {
    
    @Id 
    private UUID id;

    @Column (name = "nota_promedio", nullable = false, unique = false)
    private Double promedio;
}
