package com.cleiser.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cleiser.modell.Empresa;

public interface EmpresaRepository extends JpaRepository<Empresa, Long> {
	Empresa findById(long id);
	//Empresa findByRazon_social();
	
    Optional<Empresa> findByDireccion(String direccionl);
    //Users findByName(String name);
}
