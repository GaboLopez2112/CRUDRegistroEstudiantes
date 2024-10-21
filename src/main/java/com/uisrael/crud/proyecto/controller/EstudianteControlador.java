package com.uisrael.crud.proyecto.controller;

import com.uisrael.crud.proyecto.modelo.Estudiante;
import com.uisrael.crud.proyecto.repository.EstudianteRepository;
import com.uisrael.crud.proyecto.servicio.EstudianteServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class EstudianteControlador {
    @Autowired
   private EstudianteServicio estudianteServicio;

    @GetMapping({"/estudiantes","/"})
    public String listarEstudiantes(Model model){
        model.addAttribute("estudiantes",estudianteServicio.listarTodosLosEstudiantes());
        return "estudiantes";
    }
    @GetMapping("/estudiantes/nuevo")
    public String mostrarFormularioDeRegistrarEstudiante(Model modelO){
        Estudiante estudiante = new Estudiante();
        modelO.addAttribute("estudiante",estudiante);
        return "crear_estudiante";
    }
    @PostMapping("/estudiantes")
    public String guardarEstudiante(@ModelAttribute("estudiante")Estudiante estudiante){
        estudianteServicio.guardarEstudiante(estudiante);
        return "redirect:/estudiantes";
    }

    @GetMapping("/estudiantes/editar/{id}")
    public String mostrarFormularioDeEditar(@PathVariable Long id,Model modelo){
        modelo.addAttribute("estudiante",estudianteServicio.obtenerEstudiantePorIde(id));

        return "editar_estudiante";
    }

    @PostMapping("/estudiantes/{id}")
    public String actualizarEstudiante(@PathVariable Long id,@ModelAttribute("estudiante") Estudiante estudiante,Model modelo){
    Estudiante estudianteExistente = estudianteServicio.obtenerEstudiantePorIde(id);
    estudianteExistente.setId(id);
    estudianteExistente.setNombre(estudiante.getNombre());
    estudianteExistente.setApellido(estudiante.getApellido());
    estudianteExistente.setEmail(estudiante.getEmail());

    estudianteServicio.actualizarEstudiante(estudianteExistente);
        return "redirect:/estudiantes";
    }

    @GetMapping("/estudiantes/{id}")
    public String eliminarEstudiante(@PathVariable Long id){
    estudianteServicio.eliminarEstudiante(id);
    return "redirect:/estudiantes";
    }
}
