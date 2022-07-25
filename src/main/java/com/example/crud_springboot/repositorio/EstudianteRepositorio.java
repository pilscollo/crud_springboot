package com.example.crud_springboot.repositorio;

import com.example.crud_springboot.Entidad.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;


public interface EstudianteRepositorio extends JpaRepository<Estudiante,Long> {

}
