package com.uisrael.crud.proyecto.servicio;

import com.uisrael.crud.proyecto.modelo.Estudiante;
import com.uisrael.crud.proyecto.repository.EstudianteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EstudianteServicioImpl implements EstudianteServicio{
    @Autowired
    private EstudianteRepository estudianteRepository;

    @Override
    public List<Estudiante> listarTodosLosEstudiantes() {
        return estudianteRepository.findAll();
    }

    @Override
    public Estudiante guardarEstudiante(Estudiante estudiante) {
        return estudianteRepository.save(estudiante);
    }

    @Override
    public Estudiante obtenerEstudiantePorIde(Long id) {
        return estudianteRepository.findById(id).get();
    }

    @Override
    public Estudiante actualizarEstudiante(Estudiante estudiante) {
        return estudianteRepository.save(estudiante);
    }

    @Override
    public void eliminarEstudiante(Long id) {
    estudianteRepository.deleteById(id);
    }
}
