package com.example.cms.Service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.example.cms.Controller.UserRegistrationDto;
import com.example.cms.Entity.User;

public interface UserService extends UserDetailsService {
		User save(UserRegistrationDto registrationDto);
}
