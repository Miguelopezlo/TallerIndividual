package com.sb.suppliermanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sb.suppliermanagement.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
