package com.onlineVegitable.service;

import java.util.Scanner;

import com.onlineVegitable.modal.User;
import com.onlineVegitable.modal.Vegetable;

public class UserserviceImpl implements Userservice {
	User user = new User();
	Scanner sc = new Scanner(System.in);

	@Override
	public void addUser(User user) {

		System.out.println("Enter User Name : ");
		user.setName(sc.nextLine());
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
	public void authenticate(int no, String passwrd) {

	}

	@Override
	public void showlist() {
		// TODO Auto-generated method stub

	}

	@Override
	public void addcart(Vegetable vegetable) {
		// TODO Auto-generated method stub

	}

	@Override
	public void purchase() {
		// TODO Auto-generated method stub

	}
}