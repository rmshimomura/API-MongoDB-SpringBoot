package com.rodrigomshimomura.apimongodbspringboot.controllers;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rodrigomshimomura.apimongodbspringboot.domain.User;
import com.rodrigomshimomura.apimongodbspringboot.dto.UserDTO;
import com.rodrigomshimomura.apimongodbspringboot.services.UserService;

@RestController
@RequestMapping(value = "/users")
public class UserController {

	@Autowired
	UserService userService;

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<UserDTO>> findAll() {

		List<User> list = userService.findAll();
		List<UserDTO> listDTO = list.stream().map(x -> new UserDTO(x)).collect(Collectors.toList());

		return ResponseEntity.ok().body(listDTO);

	}
	
	@RequestMapping(method =  RequestMethod.GET, value = "/{id}")
	public ResponseEntity<UserDTO> findById(@PathVariable String id) {
		
		User obj = userService.findById(id);
		
		return ResponseEntity.ok().body(new UserDTO(obj));
		
	}

}
