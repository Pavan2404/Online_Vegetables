package com.onlineVegitable.service;

import com.onlineVegitable.exception.AccountNotFoundException;
import com.onlineVegitable.modal.User;

public interface Userservice {

	User validateUser(String username, String password) throws Exception;
	public User addUser(User user) ;
	User loginWithData(String getuserName, String password) throws AccountNotFoundException;
	
	
}
