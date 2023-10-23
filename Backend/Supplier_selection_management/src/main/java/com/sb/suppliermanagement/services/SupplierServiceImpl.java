package com.sb.suppliermanagement.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sb.suppliermanagement.model.Supplier;
import com.sb.suppliermanagement.repository.SupplierRepository;

@Service
public class SupplierServiceImpl implements SupplierService {

	@Autowired
	private SupplierRepository repositorio;
	
	@Transactional(readOnly=true)
	public List<Supplier> findAll() {
		return repositorio.findAll();
	}


	@Transactional(readOnly=true)
	public Optional<Supplier> findById(Long id) {
		return repositorio.findById(id);
	}
	
	@Transactional(readOnly=true)
	public List<Supplier> findByCity(String city) {
		return (List<Supplier>) repositorio.findByCity(city);
	}
	
	@Transactional(readOnly=true)
	public List<Supplier> findByScore(int score) {
		return (List<Supplier>) repositorio.findByScore(score);
	}




	@Transactional
	public Supplier save(Supplier supplier) {
		return repositorio.save(supplier);
	}

	@Transactional
	public void deleteById(Long id) {
		repositorio.deleteById(id);

	}

}
