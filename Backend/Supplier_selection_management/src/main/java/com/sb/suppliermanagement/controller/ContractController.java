package com.sb.suppliermanagement.controller;

import java.util.Optional;

import com.sb.suppliermanagement.dto.ContractDTO;
import com.sb.suppliermanagement.services.ContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/v1/")
@CrossOrigin
public class ContractController {
	
	@Autowired
	private ContractService service;
	
// Este metodo se deja comentado debido a que se usó la implementación del modelo entidad, posteriormente se hizo el cambio al DTO
//	@GetMapping("/Contract/{id}")
//	public ResponseEntity<?> getContractById(@PathVariable Long id){
//		Optional<Contract> o = service.findById(id);
//		if (o.isEmpty()) {
//			return ResponseEntity.notFound().build();
//		}
//				
//			return ResponseEntity.ok().body(o.get());
//		
//	}
	
	// Implementación del metodo get para el modelo entidad
	public ResponseEntity<?> getContractByIdDTO(@PathVariable Long id) {
	    // Llama al método findByContractid del servicio para buscar el contrato por su ID.
	    Optional<ContractDTO> o = service.findByContractid(id);

	    // Verifica si el contrato fue encontrado.
	    if (o.isEmpty()) {
	        // Si no se encuentra el contrato, devuelve una respuesta de "No encontrado" (HTTP 404).
	        return ResponseEntity.notFound().build();
	    }

	    // Si se encuentra el contrato, devuelve una respuesta exitosa (HTTP 200) con el cuerpo del objeto DTO.
	    return ResponseEntity.ok().body(o.get());
	}
}