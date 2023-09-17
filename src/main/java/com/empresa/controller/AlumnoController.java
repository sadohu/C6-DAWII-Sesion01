package com.empresa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.empresa.entity.Alumno;
import com.empresa.service.AlumnoService;

@RestController
@RequestMapping("/url/alumno") // Añadir rutas ("/url/name")
public class AlumnoController {
	
	@Autowired
	private AlumnoService alumnoService;
	
	@GetMapping
	public List<Alumno> listaAlumno(){
		List<Alumno> lstSalida = alumnoService.listaAlumno();
		return lstSalida;
	}
	
	@GetMapping("/byDni/{dni}")
	public List<Alumno> listaAlumnoByDni(@PathVariable("dni") String dni){
		List<Alumno> lstSalida = alumnoService.listaAlumnoByDni(dni);
		return lstSalida;
	}
	
	@GetMapping("/byNombreContaining/{nombre}")
	public List<Alumno> listaAlumnoByNombreContaining(@PathVariable("nombre") String nombre){
		List<Alumno> lstSalida = alumnoService.listaAlumnoNombreContaining(nombre);
		return lstSalida;
	}
}
