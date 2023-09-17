package com.empresa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.empresa.entity.Alumno;
import java.util.List;


public interface AlumnoRepository extends JpaRepository<Alumno, Integer>{
	
	public List<Alumno> findByDni(String dni);
	public List<Alumno> findByNombreContaining(String nombre);
	

}
