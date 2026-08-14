package com.sigap.backend.features.Alumno.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.sigap.backend.features.Alumno.models.Alumno;
import org.springframework.stereotype.Repository;

@Repository
public  interface  AlumnoRepository extends JpaRepository< Alumno, Long>  {
      boolean existsByEmail(String email);
}
