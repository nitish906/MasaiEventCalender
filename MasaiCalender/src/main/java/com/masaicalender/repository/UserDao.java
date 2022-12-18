package com.masaicalender.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.masaicalender.model.User;

public interface UserDao extends JpaRepository<User, String>{

	public User findByEmail(String email);
}
