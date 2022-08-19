package com.onlineVegitable.service;

import com.onlineVegitable.modal.User;
import com.onlineVegitable.modal.Vegetable;

public interface Userservice {

	public void addUser(User user);

	public void authenticate(int no, String passwrd);

	public void showlist();

	public void addcart(Vegetable vegetable); 

	public void purchase();

}
