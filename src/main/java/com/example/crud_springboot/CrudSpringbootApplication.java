package com.example.crud_springboot;


import com.example.crud_springboot.Entidad.Estudiante;
import com.example.crud_springboot.repositorio.EstudianteRepositorio;
import com.example.crud_springboot.servicio.EstudianteServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication

public class CrudSpringbootApplication {


	public static void main(String[] args) {
		SpringApplication.run(CrudSpringbootApplication.class, args);
	}



}
