package com.cleiser.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.cleiser.modell.Empresa;
import com.cleiser.repository.EmpresaRepository;

public class EmpresaServiceImpl implements EmpresaService{
	
	@Autowired
	EmpresaRepository empRepository;
	@Override
	public Empresa findById(long id) {
		
		return  empRepository.findById(id);
	}

	@Override
	public Optional<Empresa> findByDireccion(String direccion) {
		
		return empRepository.findByDireccion(direccion);
	}

	@Override
	public void saveEmp(Empresa emp) {
		empRepository.save(emp);
		
	}

	@Override
	public void updateEmp(Empresa emp) {
		
		empRepository.save(emp);
	}

	@Override
	public void deleteEmpById(long id) {
		
		empRepository.deleteById(id);
	}

	@Override
	public List<Empresa> findAllEmps() {
		
		return empRepository.findAll();
	}

	@Override
	public void deleteAllEmps() {
		empRepository.deleteAll();
		
	}

	@Override
	public boolean isEmpExist(Empresa emp) {
		
		return findByDireccion(emp.getDireccion())!=null;
	}

}
