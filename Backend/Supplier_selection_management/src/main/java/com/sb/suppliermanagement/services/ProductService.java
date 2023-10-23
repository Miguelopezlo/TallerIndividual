package com.sb.suppliermanagement.services;

import java.util.List;


import com.sb.suppliermanagement.model.Product;


public interface ProductService {
	public List<Product> findAll();
//	public List<Product> findByselectioncriteriaid(Long criteria);
	public List<Product> findByProductname(String name);
	public Product save(Product product);


}
