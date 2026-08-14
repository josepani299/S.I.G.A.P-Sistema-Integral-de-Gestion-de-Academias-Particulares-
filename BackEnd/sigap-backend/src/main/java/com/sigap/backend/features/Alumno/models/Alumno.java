package com.sigap.backend.features.Alumno.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "Alumnos")
@AllArgsConstructor
@NoArgsConstructor
public class Alumno {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message="El nombre es necesario")
    private String nombre;

    @NotBlank( message = "El apellido es necesario")
    private String apellido;

    @Column(nullable = false, unique = true)
    @Email( message= "El mail es necesario")
    private String email;

    @NotBlank(message= "La contraseña es requerida")
    @Size(min = 8)
    private String password;



}
