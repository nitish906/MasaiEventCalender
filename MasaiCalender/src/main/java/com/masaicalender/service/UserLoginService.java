package com.masaicalender.service;

import com.masaicalender.DTO.LoginDto;
import com.masaicalender.exception.CurrentUserException;
import com.masaicalender.exception.UserException;
import com.masaicalender.model.CurrentSessionUsers;

public interface UserLoginService {

	
	public CurrentSessionUsers login_User(LoginDto loginDto) throws CurrentUserException,UserException;
}
