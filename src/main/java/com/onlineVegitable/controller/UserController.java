package com.onlineVegitable.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onlineVegitable.modal.User;

import com.onlineVegitable.service.Userservice;
@CrossOrigin
@RestController
@RequestMapping("/api/user")

public class UserController {

		@Autowired
		Userservice userService;

		@Autowired
		LoginController logCon;

		
		@PostMapping("/validateUser")
		public User validateUser(@RequestBody User user) throws Exception {
			return userService.validateUser(user.getuserName(), user.getPassword());
		}

	
		@PostMapping("/adduser")
		public User addUser(@RequestBody User user)  {
			return userService.addUser(user);
		}
}
