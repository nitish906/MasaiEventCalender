package com.masaicalender.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.masaicalender.model.Events;
import com.masaicalender.model.User;


public interface EventsDao extends JpaRepository<Events, Integer> {

	
public List<Events> findByUser(User u);

}
