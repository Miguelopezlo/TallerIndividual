package com.sb.suppliermanagement.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sb.suppliermanagement.model.Product;

import com.sb.suppliermanagement.repository.ProductRepository;


@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository repositorio;
		
	@Transactional(readOnly=true)
	public List<Product> findAll() {
		return repositorio.findAll();
	}

//	@Transactional(readOnly=true)
//	public List<Product> findByselectioncriteriaid(Long criteria) {
//		return (List<Product>) repositorio.findByselectioncriteriaid(criteria);
//	}

	@Transactional(readOnly=true)
	public List<Product> findByProductname(String name) {
		return (List<Product>) repositorio.findByProductname(name);
	}

	@Transactional
	public Product save(Product product) {
		return repositorio.save(product);
	}

}
