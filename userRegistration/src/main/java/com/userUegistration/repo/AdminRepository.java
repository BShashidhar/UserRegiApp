package com.userUegistration.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.userUegistration.model.Admin;

@Repository
public interface AdminRepository extends MongoRepository<Admin, Integer> {
	
}
