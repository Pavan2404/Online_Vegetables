package com.onlineVegitable.service;

import java.util.Optional;

import com.onlineVegitable.exception.CustomerAccountException;
import com.onlineVegitable.modal.Customersupport;

public interface CustomersupportService {
	public Customersupport saveMsgs(Customersupport cs);
	public Optional<Customersupport> getMsgsDetails(Integer Id ) throws CustomerAccountException;
	public Iterable<Customersupport> findAllUsers();
	public void updateList(Customersupport css);

}
