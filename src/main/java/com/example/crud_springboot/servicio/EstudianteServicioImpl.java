package com.example.crud_springboot.servicio;

import com.example.crud_springboot.Entidad.Estudiante;
import com.example.crud_springboot.servicio.EstudianteServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.crud_springboot.repositorio.EstudianteRepositorio;

import java.util.List;
@Service
public class EstudianteServicioImpl implements EstudianteServicio {
    @Autowired
    private EstudianteRepositorio repositorio;
    @Override
    public List<Estudiante> listarTodosLosEstudiantes() {
        return (List<Estudiante>) repositorio.findAll();
    }

}
