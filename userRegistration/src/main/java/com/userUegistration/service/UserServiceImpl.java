package com.userUegistration.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.userUegistration.model.User;
import com.userUegistration.repo.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	@Autowired(required = true)
	private UserRepository userRepository;

	public User createUser(User user) {
		return userRepository.insert(user);
	}

//	public User getUserById(Integer userId) {
//		return userRepository.searchUserById(userId);
//	}
	
	public List<User> listAllUsers() {
		return userRepository.findAll();
	}

//	@Override
//	public void saveOrUpdateUserById(User user) {
//		userRepository.save(user);
//		
//	}
//
//	@Override
//	public void deleteUserById(Integer userId) {
//		userRepository.deleteById(userId);
//		
//	}
}
