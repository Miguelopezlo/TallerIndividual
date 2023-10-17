package com.sb.suppliermanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sb.suppliermanagement.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
