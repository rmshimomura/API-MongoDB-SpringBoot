package com.rodrigomshimomura.apimongodbspringboot.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.rodrigomshimomura.apimongodbspringboot.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String>{

	
	@Query("{ 'title' : { $regex: ?0, $options : 'i' } }") // ?0 stands for first parameter, in this case the String text.
	List<Post> searchTitle(String text);
	
	List<Post> findByTitleContainingIgnoreCase(String text);
	
}