package com.masaicalender.service;

import com.masaicalender.exception.CurrentUserException;
import com.masaicalender.exception.EventsException;
import com.masaicalender.model.Events;

public interface EventsService {

	
	public Events addEvents(Events events, String uuid) throws EventsException, CurrentUserException;
	public Events updateEvents(Events events, String uuid) throws EventsException, CurrentUserException;
	public Events deleteEvents(Integer id,String uuid) throws EventsException,CurrentUserException;
}
