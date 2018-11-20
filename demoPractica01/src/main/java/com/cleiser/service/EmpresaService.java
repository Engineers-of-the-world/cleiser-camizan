package com.cleiser.service;

import java.util.List;
import java.util.Optional;

import com.cleiser.modell.Empresa;

public interface EmpresaService {
	
	Empresa findById(long id);
	
	Optional<Empresa> findByDireccion(String direccion);
	
	void saveEmp(Empresa emp);
	
	void updateEmp(Empresa emp);
	
	void deleteEmpById(long id);
	
	List<Empresa> findAllEmps();
	
	void deleteAllEmps();
	
	public boolean isEmpExist(Empresa emp);

}
