package com.sb.suppliermanagement.controller;
import java.util.List;

import com.sb.suppliermanagement.model.Product;
import com.sb.suppliermanagement.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/")
@CrossOrigin
public class ProductController {
	
	@Autowired
	private ProductRepository repositorio;
	@GetMapping("/product")
	public List<Product> listProducts(){
		return repositorio.findAll();
	}
	

}
