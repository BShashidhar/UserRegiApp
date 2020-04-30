package com.userRegistration.repo;

import com.userRegistration.model.User;

public interface LoginRepository {

	boolean register(User user);
	boolean login(String userName,String password);
	boolean resetPassword(String userName,String password);
}
