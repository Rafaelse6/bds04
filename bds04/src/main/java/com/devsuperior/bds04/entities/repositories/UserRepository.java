package com.devsuperior.bds04.entities.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.bds04.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	User findByEmail(String email);
}
