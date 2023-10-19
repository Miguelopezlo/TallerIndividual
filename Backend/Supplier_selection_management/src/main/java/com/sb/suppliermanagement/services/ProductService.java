package com.sb.suppliermanagement.services;

import java.util.List;
import java.util.Optional;

import com.sb.suppliermanagement.model.Product;
import com.sb.suppliermanagement.model.Supplier;

public interface ProductService {
	public List<Product> findAll();
	public Optional<Product> findByOptional(Long id);
	public Product save(Product product);
	public void deleteById(Long id);

}
