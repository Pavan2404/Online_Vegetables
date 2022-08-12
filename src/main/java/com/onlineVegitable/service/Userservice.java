package com.onlineVegitable.service;

import java.util.Optional;

import javax.security.auth.login.AccountNotFoundException;

import com.onlineVegitable.modal.User;

public interface Userservice {

	public void addUser(User user);

	public Optional<User> authenticate(Integer vo,String password) throws AccountNotFoundException;
}
