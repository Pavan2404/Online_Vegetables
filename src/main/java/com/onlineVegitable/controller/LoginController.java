package com.onlineVegitable.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onlineVegitable.exception.AccountNotFoundException;
import com.onlineVegitable.modal.User;
import com.onlineVegitable.service.Userservice;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class LoginController {

	@Autowired
	Userservice logServ;

	/**
	 * @param user
	 * @return HttpStatus
	 * @throws ForBiddenException
	 * @throws UserNotFoundException SS
	 */
	@PostMapping("/Login")
	public User loginUser(@RequestBody User user) throws AccountNotFoundException {
		return logServ.loginWithData(user.getuserName(), user.getPassword());
	}
}
