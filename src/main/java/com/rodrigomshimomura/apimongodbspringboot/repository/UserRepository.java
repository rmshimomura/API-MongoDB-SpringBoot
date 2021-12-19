package com.rodrigomshimomura.apimongodbspringboot.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.rodrigomshimomura.apimongodbspringboot.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{

}
