package com.onlineVegitable.service;


import com.onlineVegitable.exception.AccountNotFoundException;

import java.util.Optional;

import javax.security.auth.login.AccountNotFoundException;

import com.onlineVegitable.modal.User;

public interface Userservice {

	User validateUser(String username, String password) throws Exception;
	public User addUser(User user) ;
	User loginWithData(String getuserName, String password) throws AccountNotFoundException;
	
	

	public void addUser(User user);

	public Optional<User> authenticate(Integer vo,String password) throws AccountNotFoundException;

}
