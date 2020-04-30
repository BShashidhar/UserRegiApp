package com.userUegistration.SampleData;

import com.userUegistration.model.Admin;
import com.userUegistration.model.User;

public class SampleData {
	public static User getUserDetails() {
		User user = new User();
		user.setUserId(1);
		user.setUserFirstName("Besta");
		user.setUserLastName("Shashidhar");
		user.setUserName("B Shashidhar");
		user.setUserEmail("shashi@gmail.com");
		user.setUserPassword("123456789");
		user.setProfilePicture("google.com");
		user.isActive();
		return user;
	}
	public static Admin getAdminDetails() {
		Admin admin = new Admin();
		admin.setAdminId(1);
		admin.setAdminName("admin");
		admin.setAdminPassword("admin");
		return admin;
	}
}