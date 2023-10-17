package com.sb.suppliermanagement.controller;
import java.util.List;

import com.sb.suppliermanagement.model.Supplier;
import com.sb.suppliermanagement.repository.SupplierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/")
@CrossOrigin(origins = "http://localhost:4200")
public class SupplierController {
	
	@Autowired
	private SupplierRepository repositorio;
	@GetMapping("/Supplier")
	public List<Supplier> listSupplier(){
		return repositorio.findAll();
	}

}
