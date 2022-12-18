package com.masaicalender.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.masaicalender.exception.EventsException;
import com.masaicalender.exception.UserException;
import com.masaicalender.model.Events;
import com.masaicalender.model.User;
import com.masaicalender.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;
	
	@PostMapping("/registerUser")
	public ResponseEntity<User> registerUser(@RequestBody () User user) throws UserException{
		
		User saved_user = userService.RegisterUser(user);
		
		return new ResponseEntity<User>(saved_user,HttpStatus.CREATED);
		
	}
	
	
	
	@PostMapping("/updateUser")
	public ResponseEntity<User> updateUser(@RequestBody () User user) throws UserException{
		
		User saved_user = userService.UpdateUser(user);
		
		return new ResponseEntity<User>(saved_user,HttpStatus.ACCEPTED);
		
	}
	
	
	@GetMapping("/listOfEvents")
	public ResponseEntity<List<Events>> updateUser(@RequestParam  String type) throws UserException, EventsException{
		
		List<Events> event_List = userService.list_of_event(type);
		
		return new ResponseEntity<List<Events>>(event_List,HttpStatus.ACCEPTED);
		
	}
}
