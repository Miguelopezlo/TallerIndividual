package com.sb.suppliermanagement.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sb.suppliermanagement.model.Supplier;


public interface SupplierRepository extends JpaRepository<Supplier, Long> {
	
	
	List<Supplier> findByCity(String city);
	List<Supplier> findByScore(int score);

}
