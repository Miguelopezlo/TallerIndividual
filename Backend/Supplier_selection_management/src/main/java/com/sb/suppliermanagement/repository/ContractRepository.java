package com.sb.suppliermanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sb.suppliermanagement.model.Contract;

public interface ContractRepository extends JpaRepository<Contract, Long> {

}
