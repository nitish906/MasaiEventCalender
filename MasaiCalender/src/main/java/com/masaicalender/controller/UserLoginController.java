package com.masaicalender.controller;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.masaicalender.DTO.LoginDto;
import com.masaicalender.exception.CurrentUserException;
import com.masaicalender.exception.UserException;
import com.masaicalender.model.CurrentSessionUsers;
import com.masaicalender.service.UserLoginService;

@RestController
public class UserLoginController {
	
	@Autowired
	private UserLoginService userLoginService;
	
	@PostMapping("/LoginUSer")
	public ResponseEntity<CurrentSessionUsers> loginUser(@RequestBody LoginDto loginDto) throws CurrentUserException, UserException{
		
		CurrentSessionUsers currentSessionUsers = userLoginService.login_User(loginDto);
		
		
		return new ResponseEntity<CurrentSessionUsers>(currentSessionUsers,HttpStatus.ACCEPTED);
		
	}

}
