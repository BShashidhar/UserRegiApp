package com.userRegistration.TestBoundary;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.userRegistration.SampleData.SampleData;
import com.userRegistration.model.Admin;
import com.userRegistration.model.User;

public class TestBoundary {

	@Test
	public void testUserPasswordLength() {
		User user=SampleData.getUserDetails();
		user.getUserPassword();
		int passwordLength = 9;
		assertEquals(passwordLength, user.getUserPassword().length());
	}

	@Test
	public void testUserNameLength() {
		User user=SampleData.getUserDetails();
		user.getUserName();
		int maxChar = 5;
		boolean usernamelength = ((user.getUserName().length()) >= maxChar);
		assertEquals(usernamelength, true);
	}

	@Test
	public void testAdminPasswordLength() {
		Admin admin=SampleData.getAdminDetails();
		admin.getAdminPassword();
		int passwordLength = 5;
		assertEquals(passwordLength, admin.getAdminPassword().length());
	}

	@Test
	public void testAdminUserNameLength() {
		Admin admin=SampleData.getAdminDetails();
		admin.getAdminName();
		int maxChar = 5;
		boolean usernamelength = ((admin.getAdminName().length()) >= maxChar);
		assertEquals(usernamelength, true);
	}
}
