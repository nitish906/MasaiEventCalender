package com.masaicalender.service;

import java.util.List;

import com.masaicalender.exception.EventsException;
import com.masaicalender.exception.UserException;
import com.masaicalender.model.Events;
import com.masaicalender.model.User;

public interface UserService {

	public User RegisterUser(User user) throws UserException;
	public User UpdateUser(User user) throws UserException;	
	public List<Events> list_of_event(String type)throws EventsException,UserException;
	
}
