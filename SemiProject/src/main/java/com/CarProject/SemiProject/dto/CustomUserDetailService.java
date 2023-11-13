package com.CarProject.SemiProject.dto;

import java.util.Optional;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.CarProject.SemiProject.Entity.UserLogin;
import com.CarProject.SemiProject.Exception.excetionHandle;
import com.CarProject.SemiProject.Repository.UserRepository;

@Service
public class CustomUserDetailService implements UserDetailsService{

	private UserRepository userService;
	
	public CustomUserDetailService(UserRepository userService) {
		super();
		this.userService = userService;
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		return this.userService.findByUsername(username).orElseThrow(()-> new excetionHandle("user","userName",username));
	}

}
