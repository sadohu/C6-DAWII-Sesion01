package com.empresa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empresa.entity.Alumno;
import com.empresa.repository.AlumnoRepository;

@Service
public class AlumnoServiceImpl implements AlumnoService{

	@Autowired
	private AlumnoRepository repository;
	
	@Override
	public List<Alumno> listaAlumno() {
		return repository.findAll();
	}

	@Override
	public List<Alumno> listaAlumnoByDni(String dni) {
		return repository.findByDni(dni);
	}

	@Override
	public List<Alumno> listaAlumnoNombreContaining(String nombre) {
		return repository.findByNombreContaining(nombre);
	}

}
