package com.onlineVegitable.service;

import java.util.Optional;
import java.util.Scanner;

import javax.security.auth.login.AccountNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;

import com.onlineVegitable.modal.User;
import com.onlineVegitable.repository.UserRepository;

public class UserserviceImpl implements Userservice {
	
	@Autowired
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