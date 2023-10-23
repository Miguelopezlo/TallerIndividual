package com.sb.suppliermanagement.controller;

import java.util.Optional;
import com.sb.suppliermanagement.model.Contract;
import com.sb.suppliermanagement.services.ContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/v1/")
@CrossOrigin
public class ContractController {
	
	@Autowired
	private ContractService service;
	
	@GetMapping("/Contract/{id}")
	public ResponseEntity<?> getContractById(@PathVariable Long id){
		Optional<Contract> o = service.findById(id);
		if (o.isEmpty()) {
			return ResponseEntity.notFound().build();
		}
				
			return ResponseEntity.ok().body(o.get());
		
	}
	
}