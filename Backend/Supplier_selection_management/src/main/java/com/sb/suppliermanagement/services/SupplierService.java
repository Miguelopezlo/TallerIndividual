package com.sb.suppliermanagement.services;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.query.Param;

import com.sb.suppliermanagement.model.Supplier;
import com.sb.suppliermanagement.model.SupplierProductv1;

public interface SupplierService {
	public List<Supplier> findAll();
	public Optional<Supplier> findById(Long id);
	public List<Supplier> findByCity(String city);
	public List<Supplier> findByScore(int score);
	public Supplier save(Supplier supplier);
	public void deleteById(Long id);
	public List<Supplier> getSupplierByProductid( Long productid);
	
}
