package com.sb.suppliermanagement.controller;
import java.util.List;
import java.util.Optional;

import com.sb.suppliermanagement.model.Supplier;
import com.sb.suppliermanagement.repository.SupplierRepository;
import com.sb.suppliermanagement.services.SupplierService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/")
@CrossOrigin(origins = "http://localhost:4200")
public class SupplierController {
	
	@Autowired
	private SupplierService service;
	
	
	private SupplierRepository repositorio;
	
	@GetMapping("/Supplier/all")
	public ResponseEntity<?> listSupplier(){
		return ResponseEntity.ok().body(service.findAll());
	}
	@GetMapping("/Supplier/{id}")
	public ResponseEntity<?> listSupplierById(@PathVariable Long id){
		Optional<Supplier> o = service.findById(id);
		if (o.isEmpty()) {
			return ResponseEntity.notFound().build();
		}
			
		return ResponseEntity.ok().body(o.get());
	}
	
	@PostMapping("/Supplier")
	public ResponseEntity<?> createSupplier(@RequestBody Supplier supplier){
		Supplier supplierdb = service.save(supplier);
		return ResponseEntity.status(HttpStatus.CREATED).body(supplierdb);
	}
	
	@PutMapping("/Supplier/{id}")
	public ResponseEntity<?> updateScoreSupplier(@RequestBody Supplier supplier, @PathVariable Long id){
		Optional<Supplier> o = service.findById(id);
		if (o.isEmpty()) {
			return ResponseEntity.notFound().build();
		}
		
		Supplier supplierdb = o.get();
		supplierdb.setScore(supplier.getScore());
		return ResponseEntity.status(HttpStatus.CREATED).body(service.save(supplierdb));
		
	}
	
	@DeleteMapping("Supplier/{id}")
	public ResponseEntity<?> deleteSupplier(@PathVariable Long id){
		service.deleteById(id);
		return ResponseEntity.noContent().build();
		
	}


}
