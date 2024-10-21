package com.uisrael.crud.proyecto.repository;

import com.uisrael.crud.proyecto.modelo.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstudianteRepository  extends JpaRepository<Estudiante,Long> {

}
