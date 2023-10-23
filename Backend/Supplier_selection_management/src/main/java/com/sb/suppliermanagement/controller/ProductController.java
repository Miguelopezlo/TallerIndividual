package com.sb.suppliermanagement.controller;
import java.util.List;

import com.sb.suppliermanagement.model.Product;
import com.sb.suppliermanagement.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/")
@CrossOrigin
public class ProductController {
	@Autowired
	private ProductService service;
	
	
	@GetMapping("/Product/all")
	public ResponseEntity<?> listProduct(){
		System.out.println("Ejecutando Lista de productos");
		return ResponseEntity.ok().body(service.findAll());
	}
	

//	@GetMapping("/Prodcut/criteria/{criteria}")
//	public ResponseEntity<?> listProductByselectioncriteriaid(@PathVariable Long criteria){
//		List<Product> o = service.findByselectioncriteriaid(criteria);
//		if (o.isEmpty()) {
//			return ResponseEntity.notFound().build();
//		}
//			
//		return ResponseEntity.ok(o);
//	}
	
	
	@GetMapping("/Prodcut/criteria/{name}")
	public ResponseEntity<?> listProductByProductname(@PathVariable String name){
		List<Product> o = service.findByProductname(name);
		if (o.isEmpty()) {
			return ResponseEntity.notFound().build();
		}
			
		return ResponseEntity.ok(o);
	}
	
	
	@PostMapping("/Product")
	public ResponseEntity<?> createSupplier(@RequestBody Product product){
		Product productdb = service.save(product);
		return ResponseEntity.status(HttpStatus.CREATED).body(productdb);
	}
}
