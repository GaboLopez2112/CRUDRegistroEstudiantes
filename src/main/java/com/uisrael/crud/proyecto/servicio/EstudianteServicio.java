package com.uisrael.crud.proyecto.servicio;

import com.uisrael.crud.proyecto.modelo.Estudiante;

import java.util.List;

public interface EstudianteServicio {
    public List<Estudiante> listarTodosLosEstudiantes();

    public Estudiante guardarEstudiante(Estudiante estudiante);

    public Estudiante obtenerEstudiantePorIde(Long id);

    public Estudiante actualizarEstudiante(Estudiante estudiante);

    public void eliminarEstudiante(Long id);

}
