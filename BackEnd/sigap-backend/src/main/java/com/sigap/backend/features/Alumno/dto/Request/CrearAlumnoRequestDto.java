package com.sigap.backend.features.Alumno.dto.Request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CrearAlumnoRequestDto {
     @NotBlank(message = "El nombre es requerido")
    @Pattern(
    regexp = "^[a-zA-ZáéíóúÁÉÍÓÚñÑüÜ ]+$", message = "El nombre solo puede contener letras")
    private String nombre;

    @NotBlank(message = "El apellido es requerido")
    @Pattern(
        regexp = "^[a-zA-ZáéíóúÁÉÍÓÚñÑüÜ ]+$",
        message = "El apellido solo puede contener letras"
    )
    private String apellido;

    @NotBlank(message="El mail es requerido")
    @Email(message= "El mail tiene que tener la estrutura ...@...")
    private String email;

    @NotBlank(message="La contraseña es requerida")
    @Size(min=8,message="La contraseña tiene que tener un minimo de de 8 caracteres")
    private String password;

}
