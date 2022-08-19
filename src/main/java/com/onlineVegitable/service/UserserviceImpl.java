package com.onlineVegitable.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlineVegitable.exception.AccountNotFoundException;
import com.onlineVegitable.modal.User;
import com.onlineVegitable.repository.QueryClassPersitContext;

import java.util.Optional;
import java.util.Scanner;

import javax.security.auth.login.AccountNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;

import com.onlineVegitable.modal.User;

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

	public UserRepository urepo;
	
	User user = new User();
	Scanner sc = new Scanner(System.in);

	@Override
	public void addUser(User user) {

		System.out.println("Enter User Name : ");
		user.setuserName(sc.nextLine());
		System.out.println("Enter Mobile no : ");
		user.setMobileno(sc.nextInt());
		System.out.println("Enter User Address : ");
		user.setAddress(sc.nextLine());
		System.out.println("Enter User Emailid : ");
		user.setEmailID(sc.nextLine());
		System.out.println("Enter User Password : ");
		user.setPassword(sc.nextLine());
		sc.nextLine();
		System.out.println("Success! user Created");

	}

	@Override
	public Optional<User> authenticate(Integer no, String password) throws AccountNotFoundException {
		// TODO Auto-generated method stub
		if(urepo.findById(no)==null) {
			throw new AccountNotFoundException("User is not registered. Please Register first");
		}
		return urepo.findById(no);

	}
	
}