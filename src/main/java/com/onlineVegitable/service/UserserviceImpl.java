package com.onlineVegitable.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlineVegitable.exception.AccountNotFoundException;
import com.onlineVegitable.modal.User;
import com.onlineVegitable.repository.QueryClassPersitContext;
import com.onlineVegitable.repository.UserRepository;

@Service
public class UserserviceImpl implements Userservice {
	
	@Autowired
	UserRepository userrepo;
    @Autowired
    QueryClassPersitContext qcp;

	@Override
	public User validateUser(String username, String password) throws AccountNotFoundException {
		User pUser = qcp.findByUserName(username);
		if(pUser == null )throw new AccountNotFoundException("Invalid Username");
		if(pUser.getPassword().equals(password)) return pUser;
		else {
			throw new AccountNotFoundException("Invalid Password");
		}
	}

	@Override
	public User addUser(User user) {
		
		return userrepo.save(user);
	}
	public User loginWithData(String username,String password) throws AccountNotFoundException {
		User user=qcp.findByUserName(username);
		
		
		userrepo.save(user);
		return user;
	}
}