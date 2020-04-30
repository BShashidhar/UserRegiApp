package com.userRegistration.service;

import java.util.List;

import com.userRegistration.model.User;

public interface UserService {
	User createUser(User user);
	User getUserById(Integer userId);
	List<User> listAllUsers();
//	void saveOrUpdateUserById(User user);
//	void deleteUserById(Integer userId);	
}
