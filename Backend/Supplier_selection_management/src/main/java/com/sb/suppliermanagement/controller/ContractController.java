package com.sb.suppliermanagement.controller;
import java.util.List;

import com.sb.suppliermanagement.model.Contract;
import com.sb.suppliermanagement.repository.ContractRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/v1/")
public class ContractController {
	
	@Autowired
	private ContractRepository repositorio;
	@GetMapping("/Product")
	public List<Contract> listProducts(){
		return repositorio.findAll();
	}

}
