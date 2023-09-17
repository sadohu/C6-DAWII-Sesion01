package com.empresa.service;

import java.util.List;

import com.empresa.entity.Alumno;

public interface AlumnoService {

	public abstract List<Alumno> listaAlumno();
	public abstract List<Alumno> listaAlumnoByDni(String dni);
	public abstract List<Alumno> listaAlumnoNombreContaining(String nombre);
}
