package com.sb.suppliermanagement.services;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.sb.suppliermanagement.model.Contract;
import com.sb.suppliermanagement.repository.ContractRepository;


@Service
public class ContractServiceImpl implements ContractService {
	
	@Autowired
	private ContractRepository repositorio;

	@Transactional(readOnly=true)
	public Optional<Contract> findById(Long id) {
		return repositorio.findById(id);
	}

}
