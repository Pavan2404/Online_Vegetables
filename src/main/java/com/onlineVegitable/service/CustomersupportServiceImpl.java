package com.onlineVegitable.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.onlineVegitable.modal.Customersupport;

import com.onlineVegitable.exception.OrderNotFoundException;
import com.onlineVegitable.modal.Customersupport;
import com.onlineVegitable.modal.ViewOrder;

import com.onlineVegitable.repository.CustomersupportRepository;

@Service
public class CustomersupportServiceImpl implements CustomersupportService{
	@Autowired
	private CustomersupportRepository repos;

	@Override
	public Customersupport saveMsgs(Customersupport cs) {
		// TODO Auto-generated method stub
		return repos.save(cs);
	}

	@Override

	public Optional<Customersupport> getMsgsDetails(Integer Id) {
		// TODO Auto-generated method stub

	public Optional<Customersupport> getMsgsDetails(Integer Id) throws OrderNotFoundException {
		Optional<Customersupport> vo=repos.findById(Id);
		if(vo==null) {
			throw new OrderNotFoundException (" OrderId :"+Id+"does not exist");
		}

		return repos.findById(Id);
	}

	@Override
	public Iterable<Customersupport> findAllUsers() {
		// TODO Auto-generated method stub
		return repos.findAll();
	}

	@Override
	public void updateList(Customersupport css) {
		// TODO Auto-generated method stub
		System.out.println(repos.save(css));
		
	}

}
