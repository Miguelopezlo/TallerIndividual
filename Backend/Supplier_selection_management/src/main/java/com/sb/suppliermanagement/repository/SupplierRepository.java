package com.sb.suppliermanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sb.suppliermanagement.model.Supplier;

public interface SupplierRepository extends JpaRepository<Supplier, Long> {

}
