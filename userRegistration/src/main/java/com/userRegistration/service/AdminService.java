package com.userRegistration.service;

import java.util.List;

import com.userRegistration.model.Admin;

public interface AdminService {
	Admin createAdmin(Admin admin);
//	User getUserById(Integer userId);
	List<Admin> listAllAdmins();
//	void saveOrUpdateUserById(User user);
//	void deleteUserById(Integer userId);	
}
