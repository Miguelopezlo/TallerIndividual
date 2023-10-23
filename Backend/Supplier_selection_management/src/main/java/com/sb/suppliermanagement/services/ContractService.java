package com.sb.suppliermanagement.services;


import java.util.Optional;

import com.sb.suppliermanagement.model.Contract;

public interface ContractService {
	public Optional<Contract> findById(Long id);

}
