package com.userRegistration.TestFunctional;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.userRegistration.SampleData.SampleData;
import com.userRegistration.model.Admin;
import com.userRegistration.model.User;
import com.userRegistration.repo.AdminRepository;
import com.userRegistration.repo.UserRepository;
import com.userRegistration.service.AdminServiceImpl;
import com.userRegistration.service.UserServiceImpl;

public class TestFunctional {
	@Mock
	private UserRepository userRepository;
	@Mock
	private AdminRepository adminRepository;

	@Mock
	private User user;
	@Mock
	private Admin admin;

	@InjectMocks
	private UserServiceImpl userServiceImpl;

	@InjectMocks
	private AdminServiceImpl adminServiceImpl;

	@Before
	public void init() {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void testCreateUser() {
		User user = SampleData.getUserDetails();
		userServiceImpl.createUser(user);
		verify(userRepository, times(1)).insert(user);
	}

	@Test
	public void testCreateAdmin() {
		Admin admin = SampleData.getAdminDetails();
		adminServiceImpl.createAdmin(admin);
		verify(adminRepository, times(1)).insert(admin);
	}

	@SuppressWarnings("static-access")
	@Test
	public void getUserByIdTest() {
		when(userRepository.searchUserById(1)).thenReturn(new SampleData().getUserDetails());
		User user = userServiceImpl.getUserById(1);
		assertEquals(1, user.getUserId());
		assertEquals("Shashidhar", user.getUserLastName());
		assertEquals("shashi@gmail.com", user.getUserEmail());
	}

	@Test
	public void getAllUsersTest() {
		List<User> list = new ArrayList<User>();
		User user1 = new User();
		user1.setUserId(1);
		user1.setUserFirstName("Besta");
		user1.setUserLastName("Shashidhar");
		user1.setUserName("B Shashidhar");
		user1.setUserEmail("shashi@gmail.com");
		user1.setUserPassword("123456789");
		user1.setProfilePicture("google.com");
		user1.isActive();
		User user2 = new User();
		user2.setUserId(2);
		user2.setUserFirstName("Besta");
		user2.setUserLastName("Shashidhar");
		user2.setUserName("B Shashidhar");
		user2.setUserEmail("shashi@gmail.com");
		user2.setUserPassword("123456789");
		user2.setProfilePicture("google.com");
		user2.isActive();

		list.add(user1);
		list.add(user2);

		when(userRepository.findAll()).thenReturn(list);

		List<User> userList = userServiceImpl.listAllUsers();

		assertEquals(2, userList.size());
		verify(userRepository, times(1)).findAll();
	}
}
