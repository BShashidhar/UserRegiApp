package com.userRegistration.TestException;

import org.junit.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.userRegistration.model.User;
import com.userRegistration.service.LoginService;
import com.userUegistration.exception.UserAlreadyExistException;
import com.userUegistration.exception.UserDoesNotExistException;

import junit.framework.Assert;

public class TestException {

	@Test
	public void testForUserRegistration() throws UserAlreadyExistException {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
		User user = new User();
		user.setUserName("admin");
		user.setUserPassword("james");
		LoginService loginservice = (LoginService) context.getBean("LoginService");
		loginservice.register(user);
		Assert.assertEquals(UserAlreadyExistException.message, "user already exists !..please login");
		context.close();	
		
	}

	@Test
	public void testForUserLogin() throws UserDoesNotExistException {

		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
		User user = new User();
		user.setUserName("admin");
		user.setUserPassword("james");
		LoginService loginservice = (LoginService) context.getBean(LoginService.class);
		loginservice.login(user.getUserName(), user.getUserPassword());
		Assert.assertEquals(UserDoesNotExistException.message, "user already exists !..please login");
		context.close();
	}
}
