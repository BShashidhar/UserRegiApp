package com.userUegistration.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.userUegistration.model.User;

public interface UserRepository extends MongoRepository<User, Integer> {	
	
}
