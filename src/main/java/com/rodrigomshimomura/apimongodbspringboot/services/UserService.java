package com.rodrigomshimomura.apimongodbspringboot.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rodrigomshimomura.apimongodbspringboot.domain.User;
import com.rodrigomshimomura.apimongodbspringboot.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	public List<User> findAll() {
		
		return userRepository.findAll();
		
	}
	
}
