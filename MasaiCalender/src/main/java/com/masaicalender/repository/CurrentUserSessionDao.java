package com.masaicalender.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.masaicalender.model.CurrentSessionUsers;

public interface CurrentUserSessionDao extends JpaRepository<CurrentSessionUsers,String> {

	public CurrentSessionUsers findByEmail(String email);
	
	public CurrentSessionUsers findByUUID(String uUID);;
}
