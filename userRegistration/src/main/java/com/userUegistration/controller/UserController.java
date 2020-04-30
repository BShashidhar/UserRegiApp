package com.userUegistration.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.userUegistration.model.User;
import com.userUegistration.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired(required = false)
	private UserService userService;

	// test controller
	@GetMapping("/hi")
	public String hiMessage() {
		return "Hi Message";
	}
	// create User
	@PostMapping("/add")
	public User saveUser(@RequestBody User user) {
		return userService.createUser(user);
	}
	// list all Users
	@GetMapping("/getall")
	public List<User> getallUsers() {
		return userService.listAllUsers();
	}

//	@RequestMapping(value = "/get/{userId}", method = RequestMethod.GET)
//	public User getUser(@PathVariable("userId") Integer userId) {
//		return userService.getUserById(userId);
//	}
	
}
