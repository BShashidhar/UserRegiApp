package com.userRegistration.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.userRegistration.model.User;

public interface UserRepository extends MongoRepository<User, Integer> {	
	
}
