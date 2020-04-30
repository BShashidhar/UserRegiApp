package com.userRegistration.repo;

import org.springframework.stereotype.Component;

import com.userRegistration.model.User;
@Component
public class LoginRepositoryImpl implements LoginRepository {

	@Override
	public boolean register(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean login(String userName, String password) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean resetPassword(String userName, String password) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
