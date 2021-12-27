package com.rodrigomshimomura.apimongodbspringboot.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rodrigomshimomura.apimongodbspringboot.domain.Post;
import com.rodrigomshimomura.apimongodbspringboot.repository.PostRepository;
import com.rodrigomshimomura.apimongodbspringboot.services.exception.ObjectNotFoundException;

@Service
public class PostService {

	@Autowired
	private PostRepository postRepository;

	public Post findById(String id) {
		
		Optional<Post> obj = postRepository.findById(id);
		
		return obj.orElseThrow(() -> new ObjectNotFoundException("Object not found on the Data Base."));
		
	}
	
	
}
