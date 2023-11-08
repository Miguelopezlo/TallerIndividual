package com.sb.suppliermanagement.controller;
import java.util.List;

import com.sb.suppliermanagement.dto.ProductDTO;
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
	public ResponseEntity<?> listProductDTO(){
		return ResponseEntity.ok().body(service.findAllasDTO());
	}
	

	@GetMapping("/Prodcut/criteria/{criteria}")
	public ResponseEntity<?> listProductByselectioncriteriaidDTO(@PathVariable Long criteria){
		List<ProductDTO> o = service.findBySelectioncriteriaidAsDTO(criteria);
		if (o.isEmpty()) {
			return ResponseEntity.notFound().build();
		}
			
		return ResponseEntity.ok(o);
	}
	
	
	@GetMapping("/Product/productid/{productid}")
	public ResponseEntity<?> listProductByProductidDTO(@PathVariable Long productid){
		List<ProductDTO> o = service.findByProductidAsDTO(productid);
		if (o.isEmpty()) {
			return ResponseEntity.notFound().build();
		}
			 
		return ResponseEntity.ok(o);
	}
//	
//	
	@PostMapping("/Product/create")
	public ResponseEntity<?> createSupplier(@RequestBody Product product){
		Product productdb = service.save(product);
		return ResponseEntity.status(HttpStatus.CREATED).body(productdb);
	}
}
