package com.sb.suppliermanagement.services;

import java.util.List;
import java.util.Optional;

import com.sb.suppliermanagement.model.Supplier;

public interface SupplierService {
	public List<Supplier> findAll();
	public Optional<Supplier> findById(Long id);
	public Supplier save(Supplier supplier);
	public void deleteById(Long id);

}
