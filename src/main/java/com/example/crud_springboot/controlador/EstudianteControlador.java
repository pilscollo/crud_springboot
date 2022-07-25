package com.example.crud_springboot.controlador;

import com.example.crud_springboot.servicio.EstudianteServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EstudianteControlador {
    @Autowired
    private EstudianteServicio servicio;

    @GetMapping({"/estudiantes","/"})
    public  String listarEstudiantes(Model modelo)
    {
        modelo.addAttribute("estudiantes",servicio.listarTodosLosEstudiantes());
        return "estudiantes";//nos retorna al archivo estudiantes
    }
}
