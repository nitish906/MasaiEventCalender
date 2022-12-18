package com.masaicalender.service;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masaicalender.exception.EventsException;
import com.masaicalender.exception.UserException;
import com.masaicalender.model.Events;
import com.masaicalender.model.User;
import com.masaicalender.repository.EventsDao;
import com.masaicalender.repository.UserDao;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserDao userDao;
	
	@Autowired
	private EventsDao eventsDao;

	@Override
	public User RegisterUser(User user) throws UserException {

		User user2 = this.userDao.save(user);
		
		return user2;
	}

	
	
	@Override
	public User UpdateUser(User user) throws UserException {
		// TODO Auto-generated method stub
		
		User existingUser =userDao.findByEmail(user.getEmail());
		
		if(existingUser == null) {
			throw new UserException("user not present with this email" + user.getEmail());
		}
		
		User  updatedUser = userDao.save(user);
		return updatedUser;
	}



	@Override
	public List<Events> list_of_event(String type) throws EventsException, UserException {

		type = type.toUpperCase();
		
		LocalDate localDate = LocalDate .now();
		
			List<Events> user_List = this.eventsDao.findAll();
			List<Events> lists  = new ArrayList<>();
			
			if(type.equals("MONTH")) {			
				
				for(Events event:user_List) {
					Month month = event.getStart_Date().getMonth();
					if(month.toString().equals(localDate.toString())) {
						lists.add(event);
					}
				}
				return lists;
			}else if(type.equals("DAY")) {			
				
				for(Events event:user_List) {
				      int day =  event.getStart_Date().getDayOfYear();
					if(day== localDate.getDayOfYear() ) {
						lists.add(event);
					}
				}
				return lists;
				
				
			}else {
				return user_List;
			}
			
		
		
		
	}



	private String Month(LocalDate start_Date) {
		// TODO Auto-generated method stub
		
		
		return null;
	}
	
	

}
