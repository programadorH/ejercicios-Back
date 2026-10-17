package com.example.LoginAPP.models;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity 
@Table (name ="usuarios")


public class Usuario {

    @Id 
    private UUID id;

    @Column (name ="nombre_completo", nullable = true, unique = false, length = 100)
    private String nombres;

    @Column (name = "hash", nullable = false, unique = false, length = 50)
    private String contraseña_hash;
}
