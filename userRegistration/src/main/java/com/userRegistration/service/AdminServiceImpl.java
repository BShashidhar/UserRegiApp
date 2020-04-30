package com.userRegistration.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.userRegistration.model.Admin;
import com.userRegistration.repo.AdminRepository;

@Service
public class AdminServiceImpl implements AdminService {
	@Autowired(required = true)
	private AdminRepository adminRepository;

	public Admin createAdmin(Admin admin) {
		return adminRepository.insert(admin);
	}

	public List<Admin> listAllAdmins() {
		return adminRepository.findAll();
	}

//	public User getUserById(Integer userId) {
//		return userRepository.searchUserById(userId);
//	}

//	@Override
//	public void saveOrUpdateUserById(User user) {
//		userRepository.save(user);
//		
//	}

//	@Override
//	public void deleteUserById(Integer userId) {
//		userRepository.deleteById(userId);
//		
//	}
}
