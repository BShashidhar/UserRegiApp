package com.userUegistration.service;

import java.util.List;

import com.userUegistration.model.Admin;

public interface AdminService {
	Admin createAdmin(Admin admin);
//	User getUserById(Integer userId);
	List<Admin> listAllAdmins();
//	void saveOrUpdateUserById(User user);
//	void deleteUserById(Integer userId);	
}
